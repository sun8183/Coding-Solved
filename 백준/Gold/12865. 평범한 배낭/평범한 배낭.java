import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, K;
    static String s;
    static StringTokenizer st;

    static int[][] nums;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        s = br.readLine();
        st = new StringTokenizer(s);

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        nums = new int[2][N+1];
        dp = new int[N+1][K+1];

        for (int i = 1; i <= N; i++) {
            s = br.readLine();
            st = new StringTokenizer(s);

            nums[0][i] = Integer.parseInt(st.nextToken()); // 무게
            nums[1][i] = Integer.parseInt(st.nextToken()); // 가치
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                if(j >= nums[0][i]){ // 가방에 넣을 수 있는 경우
                    dp[i][j] = Math.max(dp[i-1][j], nums[1][i] + dp[i-1][j-nums[0][i]]);
                }else dp[i][j] = dp[i-1][j];
            }
        }

        // 배낭의 무게가 K일때 N번째 아이템까지 탐색한 경우 최대값 도달
        bw.write(String.valueOf(dp[N][K]));
        bw.flush();
    }
}
