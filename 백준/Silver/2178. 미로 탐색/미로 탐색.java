import java.io.*;
import java.util.ArrayDeque;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;

    static int[][] matrix;
    static int[]dr = {-1, 1, 0, 0};
    static int[]dc = {0, 0, 1, -1};
    static boolean flag;

    static int answer;

    static ArrayDeque<int[]> queue = new ArrayDeque<>();
    static int[][] visited;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        matrix = new int[N][M];
        visited = new int[N][M];

        for (int i = 0; i < N; i++) {
            s = br.readLine();

            for (int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(s.charAt(j)+"");
            }
        }

        queue.addLast(new int[] {0, 0});

        visited[0][0] = 1;

        while(!queue.isEmpty()){
            int[] current = queue.removeFirst();
            int cur_r = current[0];
            int cur_c = current[1];

            if(cur_r == N-1 && cur_c == M-1){
                flag = true;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nr = cur_r + dr[i];
                int nc = cur_c + dc[i];

                if(nr < 0 || nr >= N || nc < 0 || nc >= M){
                    continue;
                }

                if(matrix[nr][nc] == 0 || visited[nr][nc] > 0){
                    continue;
                }

                visited[nr][nc] = visited[cur_r][cur_c] + 1;
                queue.addLast(new int[] {nr, nc});
            }
        }


        answer = visited[N-1][M-1];

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
