import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static char[][] matrix;
    static int row, col;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        row = N*2 -1;
        col = N;

        matrix = new char[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = ' ';
            }
        }

        drawStar(0, N-1, N);

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                bw.write(matrix[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
    }

    public static void drawStar(int x, int y, int N){
        if (N == 3) {
            matrix[x][y] = '*';             // 1층
            matrix[x + 1][y - 1] = matrix[x + 1][y + 1] = '*';          // 2층
            matrix[x + 2][y - 2] = matrix[x + 2][y - 1] = matrix[x + 2][y] = matrix[x + 2][y + 1] = matrix[x + 2][y + 2] = '*';   // 3층
         } else {
            int div = N / 2;
            drawStar(x, y, div);
            drawStar(x + div, y - div, div);
            drawStar(x + div, y + div, div);
        }
    }
}
