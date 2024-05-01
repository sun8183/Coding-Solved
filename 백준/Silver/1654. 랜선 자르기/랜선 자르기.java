import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int target;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        target = Integer.parseInt(s.split(" ")[1]);

        nums = new int[N];

        int max = 0;
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            if(max < nums[i]) max = nums[i];
        }

        bw.write(binarySearch(max));
        bw.flush();
    }


    public static String binarySearch(long max) {
        int result;
        long mid;
        long end = 1;
        long max_line = 0;

        while (end <= max) {
            result = 0;
            mid = (max + end)/2;

            for(int i=0; i<N; i++){
                result += (int) (nums[i] / mid);
            }

            if(target <= result){
                if(max_line < mid) max_line = mid;

                end = mid+1;
            }else{
                max = mid-1;
            }

        }
        return String.valueOf(max_line);
    }
}