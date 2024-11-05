import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static BigInteger s1, s2;
    static String s;
    public static void main(String[] args) throws IOException {
        s1 = new BigInteger(br.readLine());
        s = br.readLine();
        s2 = new BigInteger(br.readLine());

        if("+".equals(s)){
            s1 = s1.add(s2);
        }else{
            s1 = s1.multiply(s2);
        }

        bw.write(s1.toString());
        bw.flush();
    }

}
