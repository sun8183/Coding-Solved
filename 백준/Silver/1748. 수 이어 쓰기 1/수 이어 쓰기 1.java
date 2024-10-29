import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, K;
    static int answer;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        K = N;

        int s = String.valueOf(N).length();

        for (int i = 1; i <= s; i++) {
            if(i == s) answer += s * N;
            else {
                answer += (int) (9 * Math.pow(10, i-1)) * i;
                N -= (int) (9 * Math.pow(10, i-1));
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
    }

}
