import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int T, N;

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += Integer.parseInt(st.nextToken());
            }

            bw.write(sum+"\n");
        }

        bw.flush();
    }

}

