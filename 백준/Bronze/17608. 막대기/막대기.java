import java.io.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] arr;
    static int max;
    static int answer = 1;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        max = arr[N-1];
        for (int i = N-2; i>=0; i--) {
            if(max < arr[i]) {
                max = arr[i];
                answer +=1;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
