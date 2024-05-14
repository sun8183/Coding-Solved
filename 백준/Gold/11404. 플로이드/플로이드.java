import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static int[][] matrix;
    static final int MAX_VALUE = 100_000_00;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i == j) matrix[i][j] = 0;
                else matrix[i][j] = MAX_VALUE;
            }
        }

        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            if(matrix[from-1][to-1] > 0) matrix[from-1][to-1] = Math.min(cost, matrix[from-1][to-1]);
            else matrix[from-1][to-1] = cost;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    matrix[j][k] = Math.min(matrix[j][k], matrix[j][i] + matrix[i][k]);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(matrix[i][j] == MAX_VALUE) matrix[i][j] = 0;

                bw.write(matrix[i][j]+" ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
