import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] s = new int[2];
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                s[i] += Integer.parseInt(st.nextToken());
            }
        }


        bw.write(String.valueOf(Math.max(s[0], s[1])));
        bw.flush();
    }

}