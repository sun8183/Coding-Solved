import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N1, N2, N12, answer;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        N1 = Integer.parseInt(st.nextToken());
        N2 = Integer.parseInt(st.nextToken());
        N12 = Integer.parseInt(st.nextToken());
        
        answer = (N1 + 1) * (N2 + 1) / (N12 + 1) -1;
        
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}














