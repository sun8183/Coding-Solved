import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N+i; j++) {
                if(N - i < j & N + i > j) bw.write("*");
                else bw.write(" ");
            }

            bw.write("\n");
        }

        bw.flush();
    }
}
