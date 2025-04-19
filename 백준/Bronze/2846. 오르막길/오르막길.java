import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static StringTokenizer st;
    static int answer, now, prev, sum;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            now = Integer.parseInt(st.nextToken());

            if(prev != 0) {
                if(prev < now) sum += now - prev;
                else sum = 0;
            }

            prev = now;
            answer = Math.max(answer, sum);
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
