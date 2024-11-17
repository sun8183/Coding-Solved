import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static BigInteger s1, s2;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        s1 = new BigInteger(st.nextToken());
        s2 = new BigInteger(st.nextToken());

        bw.write(s1.multiply(s2).toString());
        bw.flush();
    }

}
