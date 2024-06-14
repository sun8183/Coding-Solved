import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] sel;
    static int[] nums;
    static int N, M;
    static LinkedHashSet<String> set = new LinkedHashSet<>();

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        nums = new int[N];
        sel = new int[M];

        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);
        backTracking(0);

        for (String str : set) {
            bw.write(str);
            bw.write("\n");
        }
        bw.flush();
    }

    public static void backTracking(int target){
        if(target == M){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(sel[i]).append(" ");
            }
            set.add(sb.toString());
        }else{
            for (int i = 0; i < N; i++) {
                sel[target] = nums[i];
                backTracking(target+1);
            }
        }
    }
}