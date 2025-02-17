import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 2; i++) {
            int score = 0;
            st = new StringTokenizer(br.readLine());
            score += Integer.parseInt(st.nextToken())*6
                    + Integer.parseInt(st.nextToken())*3
                    + Integer.parseInt(st.nextToken())*2
                    + Integer.parseInt(st.nextToken())
                    + Integer.parseInt(st.nextToken())*2;

            bw.write(score+" ");
        }
        bw.flush();
    }

}









