import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static long A, B;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        long max = Math.max(A, B);

        A = Math.min(A, B);
        B = max;

        if(B != A) bw.write(B-A-1+"\n");
        else bw.write("0\n");
        for (long i = A+1; i < B; i++) {
            bw.write(i+" ");
        }
        bw.flush();
    }
}
