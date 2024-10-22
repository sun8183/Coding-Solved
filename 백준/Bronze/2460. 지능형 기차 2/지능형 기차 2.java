import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, K;
    static int answer;
    static int now;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            now += K-N;

            if(answer < now) answer = now;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}