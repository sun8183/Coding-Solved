import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static BigInteger a, b;

    public static void main(String[] args) throws IOException {
        a = new BigInteger(br.readLine());
        b = new BigInteger(br.readLine());

        bw.write(a.add(b).toString());
        bw.flush();
    }
}










