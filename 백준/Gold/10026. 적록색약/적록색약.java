import java.io.*;
import java.util.ArrayDeque;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[][] RGB;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, 1, -1};
    static ArrayDeque<int[]> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());
        RGB = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if('R' == s.charAt(j)) RGB[i][j] = 1;
                else if('G' == s.charAt(j)) RGB[i][j] = 2;
                else RGB[i][j] = -1;
            }
        }

        queue.addLast(new int[]{0,0});
        visited[0][0] = true;
        bw.write(bfs()+" ");
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(RGB[i][j] == 1) RGB[i][j] = 2;
            }
        }
        queue.addLast(new int[]{0,0});
        visited[0][0] = true;
        bw.write(bfs()+"");
        bw.flush();
    }

    public static int bfs(){
        int result = 0;
        while(!queue.isEmpty()){
            int[] current = queue.removeFirst();

            for (int i = 0; i < 4; i++) {
                int cur_r = current[0] + dr[i];
                int cur_c = current[1] + dc[i];

                if(cur_r < 0 || cur_r >= N || cur_c < 0 || cur_c >= N){
                    continue;
                }

                if(!visited[cur_r][cur_c] && RGB[cur_r][cur_c] == RGB[current[0]][current[1]]){
                    queue.add(new int[]{cur_r, cur_c});
                    visited[cur_r][cur_c] = true;
                }
            }

            if(queue.isEmpty()){
                result++;
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if(!visited[i][j]){
                            queue.addLast(new int[]{i, j});
                            visited[i][j] = true;
                            i = N;
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }
}

