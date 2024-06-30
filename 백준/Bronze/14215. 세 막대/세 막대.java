import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] len = new int[3];
    static int idx;
    static int max;
    static StringTokenizer st;
    static int answer;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            len[i] = Integer.parseInt(st.nextToken());
            if(i == 0) {
                max = len[i];
                idx = i;
            }
            else {
                if (max < len[i]) {
                    max = len[i];
                    idx = i;
                }
            }
        }

        answer = len[(idx+1)%3] + len[(idx+2)%3];
        if(max >= answer) answer += answer -1;
        else answer += max;
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
