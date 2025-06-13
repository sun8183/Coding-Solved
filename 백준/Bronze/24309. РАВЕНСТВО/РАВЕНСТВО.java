import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static BigInteger a, b, c;
    static String s;

    public static void main(String[] args) throws IOException {
        a = new BigInteger(br.readLine());
        b = new BigInteger(br.readLine());
        c = new BigInteger(br.readLine());

        s = b.subtract(c).divide(a).toString();

        bw.write(s);
        bw.flush();
    }
}














