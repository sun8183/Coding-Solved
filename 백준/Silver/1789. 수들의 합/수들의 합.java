import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static long N;
    static int answer;

    public static void main(String[] args) throws IOException {
        N =Long.parseLong(br.readLine());
        N *= 2;

        answer = (int)Math.sqrt(N);
        answer = (int)Math.sqrt(N - answer);

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
