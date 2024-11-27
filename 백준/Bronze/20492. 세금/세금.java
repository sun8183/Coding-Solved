import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] answer = new int[2];

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        answer[0] = N - N / 100 * 22;
        answer[1] = N - (N / 100 * 20) / 100 * 22;

        bw.write(answer[0]+" "+answer[1]);
        bw.flush();
    }

}

