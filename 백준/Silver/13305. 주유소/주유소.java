import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] bridge;
    static int[] city;
    static long answer = 0;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        bridge = new int[N-1];
        city = new int[N];

        for (int i = 0; i < N-1; i++) {
            bridge[i] = Integer.parseInt(st.nextToken());
        }

        s = br.readLine();
        st = new StringTokenizer(s);

        for (int i = 0; i < N; i++) {
            city[i] = Integer.parseInt(st.nextToken());
        }

        long min = city[0];

        for (int i = 0; i < N-1; i++) {
            if(min > city[i]){
                min = city[i];

            }

            answer += min * bridge[i];
        }
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}