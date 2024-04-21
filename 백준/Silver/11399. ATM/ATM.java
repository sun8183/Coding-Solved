import java.io.*;
import java.util.Arrays;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n;
    static int s = 0;
    static int answer = 0;
    static int[] list;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        list = new int[n];
        list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(list);

        for (int i = 0; i < n; i++) {
            s = s + list[i];
            answer += s;
        }


        bw.write(String.valueOf(answer));
        bw.flush();
    }
}