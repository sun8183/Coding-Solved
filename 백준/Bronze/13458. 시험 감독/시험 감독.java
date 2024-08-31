import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, B, C;
    static int []A;
    static long answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        answer = N;
        for (int i = 0; i < N; i++) {
            A[i] = A[i] - B;
            if(A[i] > 0) answer += (int)Math.ceil((double)A[i]/C);
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
