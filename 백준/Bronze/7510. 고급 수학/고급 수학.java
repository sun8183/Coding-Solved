import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    static int T;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int [] arr = new int[3];

            for (int j = 0; j < 3; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);
            bw.write("Scenario #"+(i+1)+":\n");
            bw.write(arr[2]*arr[2] == arr[1]*arr[1] + arr[0]*arr[0] ? "yes" : "no");
            bw.write("\n");
            bw.write("\n");
        }

        bw.flush();
    }
}













