import java.io.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int start = 1; start <= N; start++) {
            long sum = 0;
            for (int i = start; sum < N; i++) {
                sum += i;
                if (sum == N) {
                    answer++;
                    break;
                }
            }
        }

        if(N == 1) answer = 1;
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
