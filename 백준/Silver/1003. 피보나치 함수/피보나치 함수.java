import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static int[][] nums;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        nums = new int[41][2];

        nums[0][0] = 1;
        nums[0][1] = 0;

        nums[1][0] = 0;
        nums[1][1] = 1;

        for (int i = 2; i < 41; i++) {
            nums[i][0] = nums[i-1][0] + nums[i-2][0];
            nums[i][1] = nums[i-1][1] + nums[i-2][1];
        }

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());


            bw.write(nums[N][0] +" "+nums[N][1]+"\n");
        }

        bw.flush();
    }

}
