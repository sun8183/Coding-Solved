import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static long N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        bw.write(N*N+"\n");
        bw.write("2");
        bw.flush();
    }
}
