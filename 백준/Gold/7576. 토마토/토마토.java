import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;

    static int[][] matrix;

    static ArrayDeque<int[]> queue = new ArrayDeque<>();

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, 1, -1};

    static int cur_r;
    static int cur_c;
    static int[] current;
    static boolean[][] visited;
    static ArrayList<int[]> tomato = new ArrayList<>();
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        matrix = new int[M][N];
        visited = new boolean[M][N];

        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            String k = br.readLine();
            st = new StringTokenizer(k);

            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());

                if(matrix[i][j] == 1) tomato.add(new int[]{i, j});
            }
        }

        queue.addAll(tomato);

        while(!queue.isEmpty()){
            current = queue.removeFirst();
            visited[current[0]][current[1]] = true;

            for (int i = 0; i < 4; i++) {
                cur_r = current[0] + dr[i];
                cur_c = current[1] + dc[i];

                if(cur_r < 0 || cur_r >= M || cur_c < 0 || cur_c >= N){
                    continue;
                }

                if(matrix[cur_r][cur_c] == 0 && !visited[cur_r][cur_c] ){
                    matrix[cur_r][cur_c] = matrix[current[0]][current[1]] + 1;
                    visited[cur_r][cur_c] = true;
                    queue.addLast(new int[]{cur_r, cur_c});
                }
            }

        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 0) {
                    answer = 0;
                    i = N;
                    break;
                }else{
                    if (answer < matrix[i][j]) answer = matrix[i][j];
                }
            }
        }
        bw.write(String.valueOf(answer-1));
        bw.flush();
    }
}