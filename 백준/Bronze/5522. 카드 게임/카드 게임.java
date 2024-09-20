import java.io.*;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int answer;
    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 5; i++) {
            int N = Integer.parseInt(br.readLine());
            answer += N;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
