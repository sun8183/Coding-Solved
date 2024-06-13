import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static int[] nums;
    static int[] sel;
    static int[] check;
    static LinkedHashSet<String> set = new LinkedHashSet<>();

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        nums = new int[N];
        check = new int[N];
        sel = new int[M];
        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);
        backTracking(0, 0);

        for (String string : set) {
            bw.write(string);
            bw.write("\n");
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
                if(check[i] == 0) {
                    check[i] = 1;
                    sel[target] = nums[i];
                    backTracking(target + 1, i);
                    check[i] = 0;
                }
            }
        }
    }
}



