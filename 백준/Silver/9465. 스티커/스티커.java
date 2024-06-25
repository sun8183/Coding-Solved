import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int T;
    static int N;
    static int[][] nums;
    static int[][] dp;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            nums = new int[2][N];
            dp = new int[2][N];

            for (int j = 0; j < 2; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < N; k++) {
                    nums[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            dp[0][0] = nums[0][0];
            dp[1][0] = nums[1][0];

            for (int j = 1; j < N; j++) {
                if(j == 1) {
                    dp[0][j] = dp[1][j - 1] + nums[0][j];
                    dp[1][j] = dp[0][j - 1] + nums[1][j];
                }else{
                    dp[0][j] = Math.max(dp[1][j-1]+nums[0][j], Math.max(dp[0][j-2], dp[1][j-2])+nums[0][j]);
                    dp[1][j] = Math.max(dp[0][j-1]+nums[1][j], Math.max(dp[0][j-2], dp[1][j-2])+nums[1][j]);
                }
            }

            bw.write(Math.max(dp[0][N-1], dp[1][N-1])+"\n");
        }

        bw.flush();
    }
}