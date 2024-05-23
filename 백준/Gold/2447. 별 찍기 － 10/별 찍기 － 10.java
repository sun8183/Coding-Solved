import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        // 배열을 공백으로 초기화
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = ' ';
            }
        }

        drawStar(0, 0, N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bw.write(arr[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
    }

    public static void drawStar(int x, int y, int N) {
        if(N == 1){
            arr[x][y] = '*';
        }else{
            int div = N / 3;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(i == 1 && j == 1) continue;
                    drawStar(x + i * div, y + j * div, div);
                }
            }
        }
    }
}
