import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] nums;
    static int answer = -1000;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        nums = new int[N];
        dp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = nums[0];
        for (int i = 1; i < N; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
        }

        for (int i = 0; i < N; i++) {
            answer = Math.max(answer, dp[i]);
        }
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
