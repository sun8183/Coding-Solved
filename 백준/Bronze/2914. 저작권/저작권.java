import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int A, I;
    static StringTokenizer st;
    static int answer;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        I = Integer.parseInt(st.nextToken());

        answer = A * (I-1)+1;

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
