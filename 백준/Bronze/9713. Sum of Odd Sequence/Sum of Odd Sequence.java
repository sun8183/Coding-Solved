import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, answer, odd;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int s = Integer.parseInt(br.readLine());
            odd = 1;
            answer = 0;
            for (int j = 0; j < s; j += 2) {
                answer += odd;
                odd += 2;
            }

            bw.write(answer+"\n");
        }
        bw.flush();
    }
}












