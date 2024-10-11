import java.io.*;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int sum;
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 4; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        bw.write(sum/60 + "\n");
        bw.write(sum%60 + "\n");
        bw.flush();
    }
}
