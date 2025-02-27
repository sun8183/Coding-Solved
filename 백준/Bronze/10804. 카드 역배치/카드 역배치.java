import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    static int[] arr = new int[20];
    static int[] tmp = new int[20];

    public static void main(String[] args) throws IOException {
        for (int i = 1; i <= 20; i++) {
            arr[i-1] = i;
            tmp[i-1] = i;
        }

        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int idx = 0;

            for (int j = start-1; j < end; j++) {
                arr[j] = tmp[end-1-idx];
                idx++;
            }

            tmp = arr.clone();
        }

        for (int i = 0; i < 20; i++) {
            bw.write(arr[i]+" ");
        }
        bw.flush();
    }

}









