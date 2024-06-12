import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] nums;
    static int[] sel;
    static int[] check;
    static int N, M;
    static LinkedHashSet<String> set = new LinkedHashSet<>();

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        nums = new int[N];
        sel = new int[M];
        check = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);
        backTracking(0);

        for (String sb : set) {
            bw.write(sb);
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
                if(check[i] == 0){
                    check[i] = 1;
                    sel[target] = nums[i];
                    backTracking(target+1);
                    check[i] = 0;
                }
            }
        }
    }
}