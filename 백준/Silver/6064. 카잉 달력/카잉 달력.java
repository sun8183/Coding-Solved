import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int T;
    static int M;
    static int N;
    static int x;
    static int y;
    static int answer;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            answer = -1;

            for (int j = x; j <= M*N; j+=M) {
                if((j-x)%M == 0 && (j-y)%N == 0) {
                    answer = j;
                    break;
                }
            }
            bw.write(String.valueOf(answer)+"\n");
        }

        bw.flush();
    }
}
