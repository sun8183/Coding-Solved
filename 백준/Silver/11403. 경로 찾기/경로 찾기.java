import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[][] input;
    static final int INF = Integer.MAX_VALUE/2;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        input = new int[N][N];

        int temp;;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            for (int j = 0; j < N; j++) {
                temp = Integer.parseInt(st.nextToken());

                if(temp == 0) input[i][j] = INF;
                else input[i][j] = 1;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    input[j][k] = Math.min(input[j][k], input[j][i] + input[i][k]);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if(input[i][j] == INF) bw.write("0");
                else bw.write("1");

                bw.write(" ");
            }
            bw.write("\n");
        }

        bw.flush();
    }
}