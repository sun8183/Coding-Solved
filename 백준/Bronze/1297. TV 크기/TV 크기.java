import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int D, H, W;
    static StringTokenizer st;
    static double x, y;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        D = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());

        y = Math.sqrt(D * D / (1.0 + (double) W * W / (H * H)));
        x = y * W / H;

        bw.write((int)y + " " + (int)x + "\n");
        bw.flush();
    }
}
