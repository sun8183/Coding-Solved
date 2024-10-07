import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] weight;
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        weight = new int[N];

        for (int i = 0; i < N; i++) {
            weight[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(weight);

        for (int i = 0; i < N; i++) {
            answer = Math.max(weight[i]*(N-i), answer);
        }
        bw.write(String.valueOf(answer));
        bw.flush();
    }

}