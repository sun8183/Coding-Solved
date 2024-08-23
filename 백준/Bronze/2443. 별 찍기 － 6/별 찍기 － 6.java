import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        int idx = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < idx; j++) {
                bw.write(" ");
            }
            for (int j = idx; j < 2*N-1-idx; j++) {
                bw.write("*");
            }
            bw.write("\n");
            idx++;
        }
        bw.flush();
    }
}
