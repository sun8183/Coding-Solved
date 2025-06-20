import java.io.*;
import java.util.StringTokenizer;


public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T, answer;
    static String [] arr;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        arr = new String[T];
        arr = br.readLine().split(" ");

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if("1".equals(arr[i])) {
                if(a < b) answer += b-a;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
