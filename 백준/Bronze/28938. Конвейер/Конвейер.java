import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static StringTokenizer st;
    static int answer;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            answer += Integer.parseInt(st.nextToken());
        }

        if(answer == 0) bw.write("Stay");
        else if(answer > 0) bw.write("Right");
        else bw.write("Left");

        bw.flush();
    }
}
