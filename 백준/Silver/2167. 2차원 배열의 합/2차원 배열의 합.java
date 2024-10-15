import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, M, T;
    static int[][] arr;
    static int[][] cache;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        cache = new int[N+1][M+1];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if(j==1) cache[i][j] = arr[i-1][j-1];
                else cache[i][j] = cache[i][j-1] + arr[i-1][j-1];
            }
        }

        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int x1, y1, x2, y2, answer=0;

            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            if(x1 == x2 && y1 == y2) answer = arr[x1-1][y2-1];
            else{
                for (int j = x1; j <= x2; j++) {
                    answer += cache[j][y2] - cache[j][y1-1];
                }

            }

            bw.write(answer+"\n");
        }

        bw.flush();
    }

}