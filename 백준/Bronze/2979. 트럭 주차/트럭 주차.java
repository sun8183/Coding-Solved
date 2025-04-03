import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int [] arr = new int[3];
    static boolean [][] car = new boolean[3][100];

    static StringTokenizer st;
    static int answer;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for (int j = a; j < b; j++) {
                car[i][j] = true;
            }
        }

        for (int i = 0; i < 100; i++) {
            int a = 0;
            a += car[0][i] ? 1 : 0;
            a += car[1][i] ? 1 : 0;
            a += car[2][i] ? 1 : 0;

            if(a == 3) answer += 3 * arr[2];
            else if(a == 2) answer += 2 * arr[1];
            else if(a == 1) answer += arr[0];
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
