import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] path = new int[101];
    static int[] snakeOrLadder = new int[101];
    static boolean[] visited = new boolean[101];

    static int N;
    static int M;
    static ArrayDeque<Integer> queue = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= 100; i++) {    // 1000으로 큰값 초기화
            path[i] = 1000;
        }

        for (int i = 0; i < N+M; i++) {     // 뱀따로 사다리 따로 저장
            s = br.readLine();
            st = new StringTokenizer(s);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            snakeOrLadder[x] = y;
        }

        queue.add(1);
        path[1] = 0;

        while(!queue.isEmpty()){
            int now = queue.removeFirst();

            for (int i = 1; i <= 6; i++) {
                int next = now + i;
                if(next < 101) {
                    // 뱀이나 사다리가 있는 경우 도착 칸으로 이동
                    if (snakeOrLadder[next] != 0) {
                        next = snakeOrLadder[next];
                    }

                    // 방문하지 않은 칸이라면
                    if (!visited[next]) {
                        visited[next] = true; // 방문 표시
                        path[next] = path[now] + 1; // 이동 횟수 갱신
                        queue.add(next); // 큐에 추가
                    }
                }else{
                    break;
                }
            }
        }

        bw.write(path[100]+"");
        bw.flush();
    }
}

