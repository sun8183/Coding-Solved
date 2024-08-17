import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] t;
    static int[] p;
    static StringTokenizer st;
    static int[]dp;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        t = new int[N];
        p = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }
        
        // N일차의 수익을 나타내는 배열
        dp = new int[N+1];

        for (int i = 0; i < N; i++) {
            if(i + t[i] <= N) dp[i+t[i]] = Math.max(dp[i+t[i]], dp[i] + p[i]);

            dp[i+1] = Math.max(dp[i+1], dp[i]);
        }

        bw.write(String.valueOf(dp[N]));
        bw.flush();
    }
}
