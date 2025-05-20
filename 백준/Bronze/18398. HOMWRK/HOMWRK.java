import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int T, N, sum, multiple;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                sum = 0;
                multiple = 1;
                for (int k = 0; k < 2; k++) {
                    int a = Integer.parseInt(st.nextToken());

                    sum += a;
                    multiple *= a;
                }
                bw.write(sum +" "+multiple+"\n");
            }
        }
        bw.flush();
    }
}













