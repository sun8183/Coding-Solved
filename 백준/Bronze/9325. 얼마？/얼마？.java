import java.io.*;
import java.util.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringTokenizer st;
    static int T;
    static int N;
    static int answer;

    public static void main(String[] args) throws IOException {
       T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            answer = Integer.parseInt(br.readLine());
            N = Integer.parseInt(br.readLine());

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());

                answer += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            }

            bw.write(answer+"\n");
        }

       bw.flush();
    }
}
