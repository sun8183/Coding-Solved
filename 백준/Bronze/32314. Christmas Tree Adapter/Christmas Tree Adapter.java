import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int a, w, v;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        a = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        w = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        if(a <= w / v) bw.write("1");
        else bw.write("0");

        bw.flush();
    }
}
