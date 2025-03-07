import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int T, N;
    static StringTokenizer st;
    static int max;
    static String answer;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            max = 0;
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());

                String key = st.nextToken();
                int value = Integer.parseInt(st.nextToken());

                if(max < value) {
                    max = value;
                    answer = key;
                }

            }

            bw.write(answer+"\n");
        }

        bw.flush();
    }

}









