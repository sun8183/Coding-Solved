import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] a = new int[6];
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        for (int i = 0; i < 6; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if(a[0]*i + a[1]*j == a[2] && a[3]*i + a[4]*j == a[5]){
                    bw.write(i+" "+j);
                    break;
                }
            }
        }
        bw.flush();
    }
}
