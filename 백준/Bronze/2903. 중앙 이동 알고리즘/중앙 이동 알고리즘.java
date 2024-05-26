import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        dp = new int[N+1];

        int range = 2;
        for (int i = 0; i <= N; i++) {
            range = range * 2 -1;
            dp[i] = (int) Math.pow(range, 2);
        }

        bw.write(String.valueOf(dp[N-1]));
        bw.flush();
    }
}