import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String N;
    static StringTokenizer st;
    static int answer;

    public static void main(String[] args) throws IOException {
        N = br.readLine();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 5; i++) {
            String s = st.nextToken();

            if(s.charAt(s.length()-1) == N.charAt(0)){
                answer++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
