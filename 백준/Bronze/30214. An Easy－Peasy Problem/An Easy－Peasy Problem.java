import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringTokenizer st;
    static int s1, s2;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        s1 = Integer.parseInt(st.nextToken());
        s2 = Integer.parseInt(st.nextToken());

        if(s1 >= Math.ceil((double)s2 / 2)) bw.write("E");
        else bw.write("H");
        bw.flush();
    }
}
