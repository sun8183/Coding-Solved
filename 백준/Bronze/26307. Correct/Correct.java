import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringTokenizer st;
    static int answer;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        answer = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
        answer -= 9 * 60;
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
