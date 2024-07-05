import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int answer;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        answer = N * (N -1);
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
