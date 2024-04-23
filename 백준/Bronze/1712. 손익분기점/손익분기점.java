import java.io.*;
import java.util.Arrays;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] nums = new int[3];
    static int target = 0;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        nums = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();

        if(nums[1] >= nums[2]) answer = -1;
        else {
            target += nums[0];
            target += nums[2] - nums[1];

            answer = target / (nums[2] - nums[1]);
        }
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}