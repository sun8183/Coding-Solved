import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;

    static int[][] matrix;

    static ArrayDeque<int[]> queue = new ArrayDeque<>();
    static int[][] board;
    static int[] start = new int[2];
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, 1, -1};

    static int cur_r;
    static int cur_c;
    static int[] current;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        matrix = new int[N][M];
        board = new int[N][M];
        visited = new boolean[N][M];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            String k = br.readLine();
            st = new StringTokenizer(k);
            
            for (int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());

                if(matrix[i][j] == 2){
                    start[0] = i;
                    start[1] = j;
                }
            }
        }

        queue.add(start);
        board[start[0]][start[1]] = 0;

        while(!queue.isEmpty()){
            current = queue.removeFirst();

            for (int i = 0; i < 4; i++) {
                cur_r = current[0] + dr[i];
                cur_c = current[1] + dc[i];

                if(cur_r < 0 || cur_r >= N || cur_c < 0 || cur_c >= M){
                    continue;
                }

                if(matrix[cur_r][cur_c] != 0 && !visited[cur_r][cur_c] ){
                    board[cur_r][cur_c] = board[current[0]][current[1]] + 1;
                    visited[cur_r][cur_c] = true;
                    queue.addLast(new int[]{cur_r, cur_c});
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(board[i][j] == 0 && matrix[i][j] != 0) board[i][j] = -1;
            }
        }

        board[start[0]][start[1]] = 0;
        print();

        bw.flush();
    }

    public static void print() throws IOException {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                bw.write(board[i][j]+" ");
            }
            bw.write("\n");
        }
    }
}