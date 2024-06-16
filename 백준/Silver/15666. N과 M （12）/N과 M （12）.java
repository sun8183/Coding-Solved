import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N, M;
    static int[] sel;
    static int[] nums;
    static LinkedHashSet<String> set = new LinkedHashSet<>();

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        sel = new int[M];
        nums = new int[N];
        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        backTracking(0, 0);
        for (String str : set) {
            bw.write(str+"\n");
        }

        bw.flush();
    }

    public static void backTracking(int target, int start) throws IOException {
        if(target == M){
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < M; i++) {
                sb.append(sel[i]).append(" ");
            }

            set.add(sb.toString());
        }else{
            for (int i = start; i < N; i++) {
                sel[target] = nums[i];
                backTracking(target+1, i);
            }
        }
    }
}