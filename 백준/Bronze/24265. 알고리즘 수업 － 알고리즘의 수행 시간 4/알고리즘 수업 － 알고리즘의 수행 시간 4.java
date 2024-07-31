import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static long N;
    static long answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        /* for (int i = 1; i <= N-1; i++) {
            for (int j = i+1; j <= N; j++) {
                answer++;
            }
        } */

        bw.write(N*(N-1)/2+"\n");
        bw.write("2");
        bw.flush();
    }
}
