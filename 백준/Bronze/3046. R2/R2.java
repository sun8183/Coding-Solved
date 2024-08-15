import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int r1, s;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        r1 = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        s *= 2;

        bw.write(String.valueOf(s-r1));
        bw.flush();
    }
}
