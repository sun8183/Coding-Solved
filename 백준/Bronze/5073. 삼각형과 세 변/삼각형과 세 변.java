import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int []nums = new int[3];

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        while(true) {
            st = new StringTokenizer(br.readLine());
            nums[0] = Integer.parseInt(st.nextToken());
            nums[1] = Integer.parseInt(st.nextToken());
            nums[2] = Integer.parseInt(st.nextToken());

            int max = Math.max(Math.max(nums[0], nums[1]), nums[2]);
            int idx = -1;

            for (int i = 0; i < 3; i++) {
                if(max == nums[i]) {
                    idx = i;
                    break;
                }
            }

            if(nums[0] == 0 && nums[1] == 0 && nums[2] == 0) break;
            else if(nums[idx] >= nums[(idx+1) % 3] + nums[(idx+2) % 3]) bw.write("Invalid");
            else if(nums[0] == nums[1] && nums[1] == nums[2]) bw.write("Equilateral");
            else if(nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2]) bw.write("Scalene");
            else bw.write("Isosceles");

            bw.write("\n");
        }
        bw.flush();
    }

}