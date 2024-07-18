import java.io.*;
import java.util.ArrayList;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static int N;
    static boolean[] prime = new boolean[1_000_000 +1];
    static ArrayList<Integer> list;

    static int answer;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        prime[1] = true;

        for (int i = 2; i <= 1_000_000; i++) {
            int cnt = 2;
            int idx = i * cnt;
            while(idx <= 1_000_000) {
                prime[idx] = true;
                idx /= cnt;
                cnt++;
                idx *= cnt;
            }
        }

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());

            list = new ArrayList<>();

            answer = 0;

            for (int j = 1; j < N; j++) {
                if (!prime[j]) {
                    if(!prime[N-j] && N-j <= N/2) answer++;
                }
            }

            bw.write(answer+"\n");
        }
        bw.flush();
    }
}
