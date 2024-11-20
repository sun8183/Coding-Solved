import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int answer;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        answer = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        answer += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(answer));
        bw.flush();
    }

}
