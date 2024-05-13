import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        dp = new int[N+1];
        dp[1] = 1;

        int min;
        for (int i = 2; i <= N; i++) {
            min = Integer.MAX_VALUE;

            for (int j = 1; j * j<= i; j++) {
                int temp = i - j * j;
                min = Math.min(min, dp[temp]);
            }
            dp[i] = min + 1;
        }

        bw.write(dp[N]+"\n");
        bw.flush();
    }
}
