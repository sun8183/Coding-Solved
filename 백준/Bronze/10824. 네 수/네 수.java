import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken() + st.nextToken();
        String s2 = st.nextToken() + st.nextToken();
        long answer = Long.parseLong(s1) + Long.parseLong(s2);
        
        bw.write(String.valueOf(answer));
        bw.flush();
    }

}