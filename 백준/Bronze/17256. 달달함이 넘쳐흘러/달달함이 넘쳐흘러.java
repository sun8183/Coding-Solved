import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int [] arr = new int[3];
    static int [] crr = new int[3];
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            crr[i] = Integer.parseInt(st.nextToken());
        }


        bw.write(crr[0] - arr[2]+" ");
        bw.write(crr[1] / arr[1]+" ");
        bw.write(crr[2] - arr[0]+" ");
        bw.flush();
    }
}
