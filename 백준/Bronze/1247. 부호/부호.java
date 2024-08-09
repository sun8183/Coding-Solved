import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static BigInteger answer;

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 3; i++) {
            N = Integer.parseInt(br.readLine());
            answer = new BigInteger("0");
            for (int j = 0; j < N; j++) {
                answer = answer.add(new BigInteger(br.readLine()));
            }
            if(answer.compareTo(BigInteger.ZERO) > 0) bw.write("+");
            else if(answer.compareTo(BigInteger.ZERO) == 0) bw.write("0");
            else bw.write("-");

            bw.write("\n");
        }
        bw.flush();
    }
}
