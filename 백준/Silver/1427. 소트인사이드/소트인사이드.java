import java.io.*;
import java.util.Arrays;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static String s;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        s = br.readLine();

        nums = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            nums[i] = Integer.parseInt(s.charAt(i)+"");
        }

        Arrays.sort(nums);

        for (int i = nums.length -1; i >= 0; i--) {
            bw.write(nums[i]+"");
        }

        bw.flush();
    }
}
