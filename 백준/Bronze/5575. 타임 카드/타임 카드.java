import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int h_s, m_s, s_s;
    static int h_e, m_e, s_e;
    static int sum;

    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            h_s = Integer.parseInt(st.nextToken());
            m_s = Integer.parseInt(st.nextToken());
            s_s = Integer.parseInt(st.nextToken());
            h_e = Integer.parseInt(st.nextToken());
            m_e = Integer.parseInt(st.nextToken());
            s_e = Integer.parseInt(st.nextToken());

            sum = h_e * 60 * 60 + m_e * 60 + s_e;
            sum -= h_s * 60 * 60 + m_s * 60 + s_s;

            int h = sum / 3600;
            sum %= 3600;
            int m = sum / 60;
            sum %= 60;
            int s = sum;
            bw.write(h + " " + m + " " + s + "\n");
        }
        bw.flush();
    }

}





