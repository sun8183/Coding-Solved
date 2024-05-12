import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static long answer = 0;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        answer = fact(N);
        bw.write(String.valueOf(answer));
        bw.flush();
    }

    public static long fact(int n){
        if(n == 0) return 1;
        else return fact(n-1)*n;
    }
}