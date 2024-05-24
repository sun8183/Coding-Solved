import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int K;
    static int[] arr;
    static int answer=0;
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        s = br.readLine();
        st = new StringTokenizer(s);

        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        answer = arr[N - K];
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}