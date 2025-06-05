import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int answer;
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < 6; i++) {
            answer += Integer.parseInt(st.nextToken()) * 5;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
