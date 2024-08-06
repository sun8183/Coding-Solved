import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int a1, a2, b, c;
    static String s;
    static StringTokenizer st;
    static String answer;

    public static void main(String[] args) throws IOException {
        s = br.readLine();
        st = new StringTokenizer(s);
        a1 = Integer.parseInt(st.nextToken());
        a2 = Integer.parseInt(st.nextToken());

        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());

        if (a1 <= b && a1 * c + a2 <= b * c) {
            answer = "1";
        } else {
            answer = "0";
        }

        bw.write(answer);
        bw.flush();
    }
}
