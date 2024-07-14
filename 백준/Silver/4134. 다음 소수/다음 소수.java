import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            long a = Long.parseLong(br.readLine());
            while (!isPrime(a)) {
                a++;
            }

            bw.write(a+"\n");
        }

        bw.flush();
    }

    public static boolean isPrime(long n) {
        if(n == 2) return true;
        else if(n < 2) return false;
        else {
            for (int i = 2; i <= Math.sqrt(n)+1; i++) {
                if(n % i == 0) return false;
            }
        }
        return true;
    }
}
