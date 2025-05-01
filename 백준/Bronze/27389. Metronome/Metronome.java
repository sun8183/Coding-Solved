import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static double N;
    public static void main(String[] args) throws IOException {
        N = Double.parseDouble(br.readLine());
        N = N/4;
        bw.write(String.valueOf(N));
        bw.flush();
    }
}













