import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int answer;
    static int T;
    static StringTokenizer st;
    static int idx = 1;
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            int suc = Integer.parseInt(st.nextToken());
            answer += suc * idx;

            if(suc == 0) idx = 1;
            else idx++;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}
