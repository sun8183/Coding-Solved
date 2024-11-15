import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int T;
    static String s;

    public static void main(String[] args) throws IOException {
        s = br.readLine();


        bw.write(":fan::fan::fan:\n" +
                ":fan::"+s+"::fan:\n" +
                ":fan::fan::fan:");
        bw.flush();
    }

}
