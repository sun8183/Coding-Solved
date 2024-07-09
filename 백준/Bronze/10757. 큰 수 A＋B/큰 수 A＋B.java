import java.io.*;
import java.math.BigInteger;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static BigInteger A, B;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        A = new BigInteger(s.split(" ")[0]);
        B = new BigInteger(s.split(" ")[1]);

        bw.write(String.valueOf(A.add(B)));
        bw.flush();
    }
}



