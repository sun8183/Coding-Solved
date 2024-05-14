import java.io.*;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[][] matrix;
    static boolean[][] visited;

    static PriorityQueue<Integer> answer = new PriorityQueue<>();
    static ArrayDeque<int[]> queue = new ArrayDeque<>();

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        matrix = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                if(s.charAt(j) == '1') {
                    matrix[i][j] = 1;
                    if(queue.isEmpty()) queue.addLast(new int[]{i, j});
                }

                else matrix[i][j] = 0;
            }
        }

        int k = 0;
        while(!queue.isEmpty()){
            int[] current = queue.removeFirst();
            k ++;

            visited[current[0]][current[1]] = true;

            for (int i = 0; i < 4; i++) {
                int cur_r = current[0] + dr[i];
                int cur_c = current[1] + dc[i];

                if(cur_r < 0 || cur_r >= N || cur_c < 0 ||  cur_c >= N){
                    continue;
                }

                if(!visited[cur_r][cur_c] && matrix[cur_r][cur_c] == 1){
                    queue.addLast(new int[]{cur_r, cur_c});
                    visited[cur_r][cur_c] = true;
                }
            }

            if(queue.isEmpty()){
                answer.offer(k);
                k = 0;

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if(!visited[i][j] && matrix[i][j] == 1){
                            queue.addLast(new int[]{i, j});
                            visited[i][j] = true;
                            i = N;
                            break;
                        }
                    }
                }
            }
        }

        bw.write(answer.size()+"\n");
        while(!answer.isEmpty()){
            bw.write(answer.poll()+"\n");
        }
        bw.flush();
    }
}
