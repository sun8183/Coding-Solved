import java.io.*;
import java.util.Arrays;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static int[] nums;
    
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(nums);

        for (int num : nums) {
            bw.write(String.valueOf(num));
            bw.write("\n");
        }

        bw.flush();
    }
}