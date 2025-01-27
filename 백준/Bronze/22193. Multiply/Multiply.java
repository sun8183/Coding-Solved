import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static StringTokenizer st;
    static BigInteger a, b;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        a = new BigInteger(br.readLine());
        b = new BigInteger(br.readLine());
        
        a = a.multiply(b);
        
        bw.write(a.toString());
        bw.flush();
    }
}
