import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static int[] nums = new int[11];

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;

        for (int i = 3; i < 11; i++) {
            for (int j = i-3; j < i; j++) {
                nums[i] += nums[j];
            }
        }

        for (int i = 0; i < T; i++) {
            int s = Integer.parseInt(br.readLine());
            bw.write(nums[s-1]+"\n");
        }

        bw.flush();
    }
}
