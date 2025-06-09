import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static BigInteger b;

    public static void main(String[] args) throws IOException {
        while(!(b = new BigInteger(br.readLine())).toString().equals("0")){
            if(b.mod(new BigInteger("42")).toString().equals("0")){
                bw.write("PREMIADO\n");
            }
            else {
                bw.write("TENTE NOVAMENTE\n");
            }
        }
        bw.flush();
    }
}














