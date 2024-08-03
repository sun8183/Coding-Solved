import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] N = new int[3];
    static String s;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        s = br.readLine();
        st = new StringTokenizer(s);

        N[0] = Integer.parseInt(st.nextToken());
        N[1] = Integer.parseInt(st.nextToken());
        N[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(N);

        bw.write(N[0] + " " + N[1] + " " + N[2]);
        bw.flush();
    }
}
