import java.io.*;
import java.util.Arrays;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N = 5;
    static long answer = 0;
    static int sum = 0;
    static int[] arr = new int[N];

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);
        answer = sum / 5;

        bw.write(answer+"\n");
        bw.write(String.valueOf(arr[2]));
        bw.flush();
    }
}