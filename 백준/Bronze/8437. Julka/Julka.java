import java.io.*;
import java.math.BigInteger;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static BigInteger sum, a, b;

    public static void main(String[] args) throws IOException {
        sum = new BigInteger(br.readLine());
        b = new BigInteger(br.readLine());

        a = sum.add(b).divide(new BigInteger("2"));
        b = sum.subtract(b).divide(new BigInteger("2"));

        bw.write(a+"\n");
        bw.write(b+"\n");
        bw.flush();
    }
}
