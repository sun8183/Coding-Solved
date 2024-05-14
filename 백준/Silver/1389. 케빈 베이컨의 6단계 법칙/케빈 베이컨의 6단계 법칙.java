import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;

    static int[][] kevin;

    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        kevin = new int[N+1][N+1];

        for(int i=1;i<=N;i++) {
            for(int j=1;j<=N;j++) {
                kevin[i][j] = Integer.MAX_VALUE/2 -1;
                if(i == j) kevin[i][j] = 0;
            }
        }

        for (int i = 1; i <= M; i++) {
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            kevin[x][y] = 1;
            kevin[y][x] = 1;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <=N; j++) {
                for (int k = 1; k <=N; k++) {
                    kevin[j][k] = Math.min(kevin[j][k], kevin[j][i] + kevin[i][k]);
                }
            }
        }

        int min;
        int node = 1;
        
        for (int i = 1; i <= N; i++) {
            min = 0;
            for (int j = 1; j <= N; j++) {
                min += kevin[i][j];
            }
            if(answer > min) {
                answer = min;
                node = i;
            }
        }

        bw.write(String.valueOf(node));
        bw.flush();
    }
}
