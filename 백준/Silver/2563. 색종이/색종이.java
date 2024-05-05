import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int num = 0;
    static int[][] matrix = new int[100][100];

    public static void main(String[] args) throws IOException {
        num = Integer.parseInt(br.readLine());
        int answer = 0;

        int w = 0;
        int h = 0;
        String s = "";
        StringTokenizer st;

        for (int i = 0; i < num; i++) {
            s = br.readLine();
            st = new StringTokenizer(s);

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            matrix = range(w, h, matrix);
        }

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] == 1) answer ++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();

    }

    public static int[][] range(int w, int h, int[][] matrix){
        for(int i = w; i < w+10; i++){
            for (int j = h; j < h+10; j++) {
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }
}