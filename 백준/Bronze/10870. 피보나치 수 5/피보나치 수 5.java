import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n;
    static int[] fib;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        if(n > 2) {
            fib = new int[n + 1];
            fib[0] = 0;
            fib[1] = 1;
            fib[2] = 1;
            for (int i = 3; i <= n; i++) {
                fib[i] = fib[i-1] + fib[i-2];
            }

            bw.write(String.valueOf(fib[n]));
        }else{
            if(n == 0) bw.write("0");
            else bw.write("1");
        }
        bw.flush();

    }
}