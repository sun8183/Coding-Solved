import java.io.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int d1, d2;
    static double answer;

    public static void main(String[] args) throws IOException {
        d1 = Integer.parseInt(br.readLine());
        d2 = Integer.parseInt(br.readLine());

        answer = 2 * d2 * 3.141592 + d1 * 2;

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
