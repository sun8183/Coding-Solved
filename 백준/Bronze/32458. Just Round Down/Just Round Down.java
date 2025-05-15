import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static double d;

    public static void main(String[] args) throws IOException {
        d = Double.parseDouble(br.readLine());

        bw.write(String.valueOf((int)Math.floor(d)));
        bw.flush();
    }
}













