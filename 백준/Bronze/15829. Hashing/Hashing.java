import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static HashMap<String, Integer> alpha = new HashMap<>();
    static BigInteger answer = new BigInteger("0");
    static BigInteger add_Integer = new BigInteger("0");

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i <26; i++) {
            alpha.put(String.valueOf((char)('a'+i)), i+1);
        }

        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            BigInteger k = new BigInteger(alpha.get(String.valueOf(s.charAt(i)+""))+"");
            BigInteger pow = new BigInteger("31");
            pow = pow.pow(i);

            add_Integer = k.multiply(pow);

            answer = answer.add(add_Integer);
        }

        bw.write(String.valueOf(answer.mod(new BigInteger("1234567891"))));
        bw.flush();
    }
}