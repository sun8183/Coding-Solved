import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[][] matrix;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        matrix = new int[N][2];

        int x_max = -10000;
        int x_min = 10000;
        int y_max = -10000;
        int y_min = 10000;

        if(N == 1) bw.write("0");
        else {
            for (int i = 0; i < N; i++) {
                String s = br.readLine();
                StringTokenizer st = new StringTokenizer(s);

                matrix[i][0] = Integer.parseInt(st.nextToken());
                matrix[i][1] = Integer.parseInt(st.nextToken());

                if(x_max < matrix[i][0]) x_max = matrix[i][0];
                if(x_min > matrix[i][0]) x_min = matrix[i][0];
                if(y_max < matrix[i][1]) y_max = matrix[i][1];
                if(y_min > matrix[i][1]) y_min = matrix[i][1];
            }
            bw.write(Math.abs(x_max - x_min) * Math.abs(y_max - y_min)+"");
        }
        bw.flush();
    }
}


