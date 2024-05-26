import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int M, N, H;
    static int[][][] tomato;
    static boolean[][][] visited;
    static int[] dh = {0, 0, 0, 0, 1, -1};
    static int[] dr = {-1, 1, 0, 0, 0, 0};
    static int[] dc = {0, 0, -1, 1, 0, 0};

    static ArrayDeque<int[]> queue = new ArrayDeque<>();
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        tomato = new int[H][N][M];
        visited = new boolean[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                s = br.readLine();
                st = new StringTokenizer(s);
                for (int k = 0; k < M; k++) {
                    int nums = Integer.parseInt(st.nextToken());

                    if(nums == 1) {
                        queue.add(new int[]{i, j, k});
                        visited[i][j][k] = true;
                    }
                    tomato[i][j][k] = nums;
                }
            }
        }

        while(!queue.isEmpty()) {
            int[] current = queue.removeFirst();

            for (int i = 0; i < 6; i++) {
                int cur_h = current[0] + dh[i];
                int cur_r = current[1] + dr[i];
                int cur_c = current[2] + dc[i];

                if (cur_h < 0 || cur_h >= H || cur_r < 0 || cur_r >= N || cur_c < 0 || cur_c >= M) {
                    continue;
                }

                if (tomato[cur_h][cur_r][cur_c] == 0 && !visited[cur_h][cur_r][cur_c]) {
                    queue.addLast(new int[]{cur_h, cur_r, cur_c});
                    tomato[cur_h][cur_r][cur_c] = tomato[current[0]][current[1]][current[2]] + 1;
                    visited[cur_h][cur_r][cur_c] = true;
                }
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if(tomato[i][j][k] == 0){
                        answer = 0;
                        i = H;
                        j = N;
                        k = M;
                    }else {
                        if(tomato[i][j][k] > answer) answer = tomato[i][j][k];
                    }
                }
            }
        }

        bw.write(String.valueOf(answer -1));
        bw.flush();
    }
}