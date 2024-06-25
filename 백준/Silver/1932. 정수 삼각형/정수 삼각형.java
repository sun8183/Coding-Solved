import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int[][] matrix;
    static int[][] dp;
    static StringTokenizer st;
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        matrix = new int[N][N];
        dp = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int j = 0;
            while(st.hasMoreTokens()) {
                matrix[i][j++] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = matrix[0][0];

        if(N == 1){
            bw.write(String.valueOf(dp[0][0]));
        }else {
            int count = 3;
            dp[1][0] = dp[0][0] + matrix[1][0];
            dp[1][1] = dp[0][0] + matrix[1][1];

            for (int i = 2; i < N; i++) {
                for (int j = 0; j < count; j++) {
                    if (j == 0) {  // 양 끝 삼각형 dp 구하기
                        dp[i][j] = dp[i - 1][j] + matrix[i][j];
                    } else if (j == count - 1) {
                        dp[i][j] = dp[i - 1][j - 1] + matrix[i][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j - 1] + matrix[i][j], dp[i - 1][j] + matrix[i][j]);
                    }
                }
                count++;
            }
            for (int i = 0; i < N; i++) {
                answer = Math.max(answer, dp[N-1][i]);
            }

            bw.write(String.valueOf(answer));
        }
        bw.flush();
    }
}