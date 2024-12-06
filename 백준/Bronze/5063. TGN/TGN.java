import java.io.*;
import java.util.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringTokenizer st;
    static int N, r, e, c;
    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            if(r < e-c) bw.write("advertise");
            else if(r == e-c) bw.write("does not matter");
            else bw.write("do not advertise");
            bw.write("\n");
        }

        bw.flush();
    }
}
