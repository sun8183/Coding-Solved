import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] num = new int[101];
    static int N;
    static StringTokenizer st;
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            int s = Integer.parseInt(st.nextToken());
            if(num[s] != 0) answer++;
            else num[s] = s;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}









