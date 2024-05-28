import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        dp = new int[N];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < N; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        bw.write(dp[N-1]+" "+(N-2));
        bw.flush();
    }
}

