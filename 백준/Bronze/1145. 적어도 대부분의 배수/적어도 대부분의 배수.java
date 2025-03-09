import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] num = new int[5];
    static StringTokenizer st;
    static int answer;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        answer = num[0];
        
        while (true) {
            int cnt = 0;
            for (int i = 0; i < 5; i++) {
                if (answer % num[i] == 0) {
                    cnt++;
                }
            }

            if (cnt >= 3) {
                break;
            }

            answer++;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
