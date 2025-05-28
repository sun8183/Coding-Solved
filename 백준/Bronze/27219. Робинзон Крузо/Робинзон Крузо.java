import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N/5; i++) {
            bw.write("V");
        }

        for (int i = 0; i < N%5; i++) {
            bw.write("I");
        }
        bw.flush();
    }
}














