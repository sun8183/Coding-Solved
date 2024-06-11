import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static int[] sel;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        nums = new int[N];
        sel = new int[M];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);
        backTracking(0, 0);
        bw.flush();
    }

    public static void backTracking(int target, int start) throws IOException {
        if(target == M){
            for (int i = 0; i < M; i++) {
                bw.write(sel[i]+" ");
            }
            bw.write("\n");
        }else{
            for (int i = start; i < N; i++) {
                sel[target] = nums[i];
                backTracking(target+1, i);
            }
        }
    }
}