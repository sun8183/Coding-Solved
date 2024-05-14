import java.io.*;
import java.util.ArrayDeque;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static int[][] campus;
    static ArrayDeque<int[]> queue = new ArrayDeque<>();
    static boolean[][] visited;
    static int answer;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        campus = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            s = br.readLine();
            for (int j = 0; j < M; j++) {
                if('O' == s.charAt(j)) campus[i][j] = 0;
                else if('X' == s.charAt(j)) campus[i][j] = 2;
                else if('I' == s.charAt(j)) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
                else campus[i][j] = 1;
            }

        }

        while(!queue.isEmpty()){
            int[] current = queue.removeFirst();

            for (int i = 0; i < 4; i++) {
                int cur_r = current[0] + dr[i];
                int cur_c = current[1] + dc[i];

                if(cur_r < 0 || cur_r >= N || cur_c < 0 || cur_c >= M){
                    continue;
                }

                if(campus[cur_r][cur_c] <= 1 && !visited[cur_r][cur_c]){
                    queue.add(new int[]{cur_r, cur_c});
                    visited[cur_r][cur_c] = true;

                    if(campus[cur_r][cur_c] == 1) answer++;
                }
            }
        }

        if(answer == 0) bw.write("TT");
        else bw.write(String.valueOf(answer));

        bw.flush();
    }
}
