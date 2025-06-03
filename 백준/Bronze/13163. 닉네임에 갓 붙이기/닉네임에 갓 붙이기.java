import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringTokenizer st;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder("god");
            st.nextToken();
            while(st.hasMoreTokens()) {
                sb.append(st.nextToken());
            }

            bw.write(sb.toString()+"\n");
        }
        bw.flush();
    }
}
