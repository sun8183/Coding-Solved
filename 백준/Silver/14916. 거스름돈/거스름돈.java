import java.io.*;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int a1, a2;
    static int answer = -1;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        a1 = N / 5;
        a2 = (N % 5) / 2;

        if(a1 * 5 + a2 * 2 == N) answer = a1 + a2;
        else {
            while(a1 > 0) {
                a1--;
                int tmp = a1 * 5;
                a2 = (N - tmp) / 2;

                if (a1 * 5 + a2 * 2 == N){
                    answer = a1 + a2;
                    break;
                }
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
