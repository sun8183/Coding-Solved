import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[][] nums;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        nums = new int[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            for (int j = 0; j < N; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(matrix(nums, 0));
        System.out.println(matrix(nums, 1));

        bw.flush();
    }

    public static int matrix(int[][] arr, int color){
        boolean flag = false;
        int result = 0;

        if(arr.length == 1) {
            if(arr[0][0] == color) result = 1;
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (arr[i][j] != color) {
                        flag = true;
                        break;
                    }
                }
            }

            if (flag) {
                int i = 0;
                while (i < 4) {
                    int[][] f_arr = new int[arr.length / 2][arr.length / 2];
                    for (int j = 0; j < arr.length / 2; j++) {
                        for (int k = 0; k < arr.length / 2; k++) {
                            if (i == 0) f_arr[j][k] = arr[j][k];
                            else if (i == 1) f_arr[j][k] = arr[arr.length / 2 + j][k];
                            else if (i == 2) f_arr[j][k] = arr[j][arr.length / 2 + k];
                            else f_arr[j][k] = arr[arr.length / 2 + j][arr.length / 2 + k];
                        }
                    }
                    i++;
                    result += matrix(f_arr, color);

                }
            } else {
                result = 1;
            }
        }

        return result;
    }

}
