import java.io.*;
import java.util.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static int N;
    static int[][] nums;
    static int[][] cache;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        nums = new int[N][3];
        cache = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cache[0][0] = nums[0][0];
        cache[0][1] = nums[0][1];
        cache[0][2] = nums[0][2];

        // 최대값 구하기
        for (int i = 1; i < N; i++) {
            cache[i][0] = Math.max(cache[i-1][0], cache[i-1][1]) + nums[i][0];
            cache[i][1] = Math.max(Math.max(cache[i-1][0], cache[i-1][1]), cache[i-1][2]) + nums[i][1];
            cache[i][2] = Math.max(cache[i-1][1], cache[i-1][2]) + nums[i][2];
        }

        bw.write(Math.max(Math.max(cache[N-1][0], cache[N-1][1]), cache[N-1][2])+" ");

        // 최소값 구하기
        for (int i = 1; i < N; i++) {
            cache[i][0] = Math.min(cache[i-1][0], cache[i-1][1]) + nums[i][0];
            cache[i][1] = Math.min(Math.min(cache[i-1][0], cache[i-1][1]), cache[i-1][2]) + nums[i][1];
            cache[i][2] = Math.min(cache[i-1][1], cache[i-1][2]) + nums[i][2];
        }

        bw.write(Math.min(Math.min(cache[N-1][0], cache[N-1][1]), cache[N-1][2])+"");
        bw.flush();
    }
}
