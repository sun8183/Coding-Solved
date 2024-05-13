import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;

    static int[] dp = new int[1001];
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        dp[0] = 1;
        dp[1] = 3;

        for (int i = 2; i <= N; i++) {

            dp[i] = dp[i-1] + dp[i-2]*2;

            dp[i] = dp[i]%10007;
        }
        
        bw.write(String.valueOf(dp[N-1]));
        bw.flush();
    }
}
