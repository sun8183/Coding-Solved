import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T, N;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int max = 0, cost;
            String max_s = "", s;
            N = Integer.parseInt(br.readLine());
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());

                cost = Integer.parseInt(st.nextToken());
                s = st.nextToken();

                if(max < cost) {
                    max = cost;
                    max_s = s;
                }
            }

            bw.write(max_s+"\n");
        }

        bw.flush();
    }
}
