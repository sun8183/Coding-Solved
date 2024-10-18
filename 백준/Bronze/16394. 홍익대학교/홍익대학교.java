import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int answer;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        answer = N - 1946;

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}