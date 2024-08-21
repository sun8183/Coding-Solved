import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[] dp;
    
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];

        dp[0] = 0;
        if(N >= 1) {
            dp[1] = 1;

            for (int i = 2; i <= N; i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        bw.write(String.valueOf(dp[N]));
        bw.flush();
    }
}
