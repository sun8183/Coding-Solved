import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static long[] nums;
    
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        nums = new long[91];

        nums[0] = 0;
        nums[1] = 1;

        for(int i=2; i<=n; i++){
            nums[i] = nums[i-1] + nums[i-2];
        }


        bw.write(nums[n]+"\n");
        bw.flush();
    }
}