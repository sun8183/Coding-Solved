import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    static double A, B, C;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        A = Double.parseDouble(st.nextToken());
        B = Double.parseDouble(st.nextToken());
        C = Double.parseDouble(st.nextToken());


        bw.write(String.valueOf((int)Math.max(A*B/C, A/B*C)));
        bw.flush();
    }

}









