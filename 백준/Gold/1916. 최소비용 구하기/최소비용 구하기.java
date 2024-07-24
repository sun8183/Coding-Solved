import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static int N, M;
    static int[][] matrix;
    static final int MAX = 100_000_001; // N*M-1 (1000 × 100,000 -1)
    static StringTokenizer st;
    static int start, end;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        matrix = new int[N+1][N+1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if(i==j) matrix[i][j] = 0;
                else matrix[i][j] = MAX;
            }
        }

        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            st = new StringTokenizer(s);
            
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            if (from != to) {
                matrix[from][to] = Math.min(cost, matrix[from][to]);
            }
        }

        String s = br.readLine();
        st = new StringTokenizer(s);

        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    matrix[j][k] = Math.min(matrix[j][k], matrix[j][i] + matrix[i][k]);
                }
            }
            
        }

        bw.write(String.valueOf(matrix[start][end]));
        bw.flush();
    }
}
