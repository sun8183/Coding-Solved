import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int answer = 1;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            answer--;
            answer += Integer.parseInt(br.readLine());
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}