import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int end_x = 0, end_y = 0;
    static int[][] matrix;
    static int[][]x = new int[4][2];
    static int[][]y = new int[4][2];
    static int answer;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());

            x[i][0] = Integer.parseInt(st.nextToken());
            y[i][0] = Integer.parseInt(st.nextToken());
            x[i][1] = Integer.parseInt(st.nextToken());
            y[i][1] = Integer.parseInt(st.nextToken());

            end_x = Math.max(end_x, x[i][1]);
            end_y = Math.max(end_y, y[i][1]);
        }

        matrix = new int[end_x][end_y];

        for (int i = 0; i < 4; i++) {
            for (int j = x[i][0]; j <x[i][1]; j++) {
                for (int k = y[i][0]; k <y[i][1]; k++) {
                    matrix[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < end_x; i++) {
            for (int j = 0; j < end_y; j++) {
                if(matrix[i][j] == 1) answer++;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
