import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, M;
    static int [][]matrix;
    static int [][]dist;
    static boolean [][][]visited;
    static ArrayDeque<int[]> queue = new ArrayDeque<>();
    static int [] dr = {-1, 1, 0, 0};
    static int [] dc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        matrix = new int[N][M];
        dist = new int[N][M];
        visited = new boolean[N][M][2];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(s.charAt(j) + "");
            }
        }

        queue.add(new int[]{0, 0, 0});

        while(!queue.isEmpty()){
            int[] current = queue.removeFirst();

            if(current[0] == N-1 && current[1] == M-1){
                break;
            }

            for (int i = 0; i < 4; i++) {
                int cur_r = current[0] + dr[i];
                int cur_c = current[1] + dc[i];

                if(cur_r < 0 || cur_r >= N || cur_c < 0 || cur_c >= M) continue;

                if(matrix[cur_r][cur_c] == 1) { // 가려는 곳이 벽인 경우
                    if(current[2] == 0){ // 지금까지 부시고 간적이 없는경우 부시고 감
                        visited[cur_r][cur_c][1] = true;
                        dist[cur_r][cur_c] = dist[current[0]][current[1]] + 1;
                        queue.addLast(new int[]{cur_r, cur_c, 1});
                    }
                }else {  // 가려는 곳이 벽이 아닌 경우
                   if(!visited[cur_r][cur_c][current[2]]){ // 방문여부 체크 (뚫고 지나 갔는지 뚫지 않고 지나 갔는지)
                       visited[cur_r][cur_c][current[2]] = true;
                       dist[cur_r][cur_c] = dist[current[0]][current[1]] + 1;
                       queue.addLast(new int[]{cur_r, cur_c, current[2]});
                   }
               }
            }
        }

        if(dist[N-1][M-1] == 0 && !(N-1 == 0 && M-1 == 0)) bw.write("-1");
        else bw.write(String.valueOf(dist[N-1][M-1]+1));
        bw.flush();
    }
}
