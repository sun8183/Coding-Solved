import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int T, A, B;
    static StringTokenizer st;
    static int answer;
    static int idx;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            st = new StringTokenizer(s);

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            idx = A;
            A = Math.min(idx, B);
            B = Math.max(idx, B);

            answer = 1;
            idx = 2;

            if(B%A == 0) answer = B;
            else {
                while (A > idx) {
                    if (A % idx == 0 && B % idx == 0) {
                        answer *= idx;
                        A /= idx;
                        B /= idx;
                    } else idx++;
                }
                answer *= A * B;
            }
            bw.write(answer+"\n");
        }

        bw.flush();
    }
}



