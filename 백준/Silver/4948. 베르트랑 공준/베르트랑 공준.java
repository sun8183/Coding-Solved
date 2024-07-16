import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static boolean[] prime = new boolean[123_456 * 2 +1];
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        prime[1] = true;

        for (int i = 2; i <= 123_456 * 2 ; i++) {
            int cnt = 2;
            int idx = i * cnt;
            while(idx <= 123_456 * 2) {
                prime[idx] = true;
                idx /= cnt;
                cnt++;
                idx *= cnt;
            }
        }

        while(N != 0){
            answer = 0;

            for (int i = N+1; i <= 2 * N; i++) {
                if(!prime[i]) answer++;
            }

            bw.write(answer+"\n");
            N = Integer.parseInt(br.readLine());
        }
        bw.flush();
    }
}
