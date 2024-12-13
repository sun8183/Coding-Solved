import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    static int[] arr = new int[4];

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        bw.write(String.valueOf(Math.abs(arr[0]+arr[3] - (arr[1] + arr[2]))));
        bw.flush();
    }

}




