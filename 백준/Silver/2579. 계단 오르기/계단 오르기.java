import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] nums;
    static int[] nums_s;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        nums = new int[N];
        nums_s = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        if(N == 1) nums_s[0] = nums[0];
        else if(N == 2) nums_s[1] = nums[0] + nums[1];
        else {
            nums_s[0] = nums[0];
            nums_s[1] = nums[0] + nums[1];
            nums_s[2] = nums[2] + Math.max(nums[0], nums[1]);

            for (int i = 3; i < N; i++) {
                nums_s[i] = nums[i] + Math.max(nums[i-1] + nums_s[i-3], nums_s[i-2]);
            }
        }

        bw.write(String.valueOf(nums_s[N-1]));
        bw.flush();
    }

}
