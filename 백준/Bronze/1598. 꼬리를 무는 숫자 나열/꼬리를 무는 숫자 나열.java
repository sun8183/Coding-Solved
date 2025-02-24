import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    static int A, B;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        int x1, x2, y1, y2;

        x1 = (A - 1)/4;
        x2 = (B - 1)/4;

        y1 = (A - 1)%4;
        y2 = (B - 1)%4;

        bw.write(String.valueOf(Math.abs(x1 - x2) + Math.abs(y1 - y2)));
        bw.flush();
    }

}









