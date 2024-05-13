import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static int N;
    static long[] dp = new long[101];
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= 100; i++) {
            dp[i] = dp[i-3] + dp[i-2];
        }

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());

            bw.write(dp[N-1]+"\n");
        }

        bw.flush();
    }
}
