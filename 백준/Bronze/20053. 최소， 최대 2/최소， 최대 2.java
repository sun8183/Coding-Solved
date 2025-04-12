import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static int N;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int max = -1_000_000;
            int min = 1_000_000;
            for (int j = 0; j < N; j++) {
                int a = Integer.parseInt(st.nextToken());
                
                min = Math.min(min, a);
                max = Math.max(max, a);
            }
            
            bw.write(min + " " + max + "\n");
        }

        bw.flush();
    }
}
