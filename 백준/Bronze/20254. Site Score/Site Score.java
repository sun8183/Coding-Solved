import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static StringTokenizer st;
    static int answer;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        answer += 56 * Integer.parseInt(st.nextToken());
        answer += 24 * Integer.parseInt(st.nextToken());
        answer += 14 * Integer.parseInt(st.nextToken());
        answer += 6 * Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}













