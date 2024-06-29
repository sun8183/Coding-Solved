import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N, M;
    static int[][] nums;
    static int[][] cache;
    static int[][] point;

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nums = new int[N][N];
        cache = new int[N+1][N+1];
        point = new int[M][4];

        /* 배열 삽입 */
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
                cache[i+1][j+1] = nums[i][j] + cache[i][j+1] + cache[i+1][j] - cache[i][j];
            }
        }

        /* 구해야할 좌표 합*/
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) - 1;
            int y1 = Integer.parseInt(st.nextToken()) - 1;
            int x2 = Integer.parseInt(st.nextToken()) - 1;
            int y2 = Integer.parseInt(st.nextToken()) - 1;

            // 구간 합 구하기
            int answer = cache[x2+1][y2+1] - cache[x2+1][y1] - cache[x1][y2+1] + cache[x1][y1];
            bw.write(answer + "\n");
        }

        bw.flush();
    }
}
