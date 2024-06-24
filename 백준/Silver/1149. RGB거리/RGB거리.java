import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[][] matrix;
    static int N;
    static int[][] dp;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        matrix = new int[N][3];
        dp = new int[N][3];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = matrix[0][0];
        dp[0][1] = matrix[0][1];
        dp[0][2] = matrix[0][2];

        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(dp[i-1][1] + matrix[i][0], dp[i-1][2] + matrix[i][0]);
            dp[i][1] = Math.min(dp[i-1][0] + matrix[i][1], dp[i-1][2] + matrix[i][1]);
            dp[i][2] = Math.min(dp[i-1][0] + matrix[i][2], dp[i-1][1] + matrix[i][2]);
        }

        int answer = Math.min(dp[N-1][0], dp[N-1][1]);
        answer = Math.min(answer, dp[N-1][2]);

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}