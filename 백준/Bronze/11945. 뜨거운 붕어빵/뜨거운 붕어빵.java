import java.io.*;
import java.util.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringTokenizer st;
    static int N;

    public static void main(String[] args) throws IOException {
       st = new StringTokenizer(br.readLine());
       N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            StringBuilder s = new StringBuilder(br.readLine());
            bw.write(s.reverse() +"\n");
        }

        bw.flush();
    }
}
