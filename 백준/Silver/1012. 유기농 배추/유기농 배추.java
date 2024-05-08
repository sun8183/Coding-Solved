import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static int N;
    static int M;
    static int K;
    
    static int[][] matrix;
    static int[][] board;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, 1, -1};

    static ArrayDeque<int[]> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            N = Integer.parseInt(s.split(" ")[0]);
            M = Integer.parseInt(s.split(" ")[1]);
            K = Integer.parseInt(s.split(" ")[2]);

            matrix = new int[N][M];

            int answer=0;

            for (int j = 0; j < K; j++) {
                s = br.readLine();
                int x = Integer.parseInt(s.split(" ")[0]);
                int y = Integer.parseInt(s.split(" ")[1]);

                matrix[x][y] = 1;
            }

            board = matrix.clone();

            while(true){
                int[]current;

                if(queue.isEmpty()) {
                    answer++;
                    current = FirstIndex();

                    if(current[0] != -1 && current[1] != -1) {
                        board[current[0]][current[1]] = 0;
                        queue.addLast(current);
                    }else {
                        answer --;
                        break;
                    }
                }
                else {
                    current = queue.removeFirst();
                }

                for (int j = 0; j < 4; j++) {
                    int cur_r = current[0] + dr[j];
                    int cur_c = current[1] + dc[j];

                    if(cur_r < 0 || cur_r >= N || cur_c < 0 || cur_c >= M){
                        continue;
                    }

                    if(matrix[cur_r][cur_c] == 1) {
                        queue.addLast(new int[] {cur_r, cur_c});
                        board[cur_r][cur_c] = 0;
                    }
                }

            }

            bw.write(String.valueOf(answer)+"\n");
        }

        bw.flush();
    }

    public static int[] FirstIndex(){   // 가장 가까운 인접선을 찾는 함수

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(board[i][j] == 1) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

}
