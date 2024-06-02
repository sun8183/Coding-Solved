import java.beans.Visibility;
import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static int[][] matrix;
    static boolean[][] visited;

    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};
    static int answer;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        matrix = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            for (int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = true;
                dfs(i, j, 1, matrix[i][j]);
                visited[i][j] = false;
                bfs(i, j);
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

    public static void dfs(int r, int c, int depth, int total){
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        stack.addLast(new int[] {r, c, depth, total});
        int[] current = stack.removeLast();

        if (current[2] == 4) {
            answer = Math.max(answer, current[3]);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int cur_r = current[0] + dr[i];
            int cur_c = current[1] + dc[i];

            if (cur_r < 0 || cur_r >= N || cur_c < 0 || cur_c >= M) {
                continue;
            }

            if (!visited[cur_r][cur_c]) {
                visited[cur_r][cur_c] = true;
                dfs(cur_r, cur_c, current[2]+1, current[3] + matrix[cur_r][cur_c]);
                visited[cur_r][cur_c] = false;
            }
        }
    }

    public static void bfs(int r, int c) {
        if (r >= 1 && r < N - 1 && c >= 1) {
            int total = matrix[r][c] + matrix[r - 1][c] + matrix[r + 1][c] + matrix[r][c - 1];
            answer = Math.max(answer, total);
        }
        if (r >= 1 && r < N - 1 && c < M - 1) {
            int total = matrix[r][c] + matrix[r - 1][c] + matrix[r + 1][c] + matrix[r][c + 1];
            answer = Math.max(answer, total);
        }
        if (r >= 1 && c >= 1 && c < M - 1) {
            int total = matrix[r][c] + matrix[r - 1][c] + matrix[r][c - 1] + matrix[r][c + 1];
            answer = Math.max(answer, total);
        }
        if (r < N - 1 && c >= 1 && c < M - 1) {
            int total = matrix[r][c] + matrix[r + 1][c] + matrix[r][c - 1] + matrix[r][c + 1];
            answer = Math.max(answer, total);
        }
    }
}