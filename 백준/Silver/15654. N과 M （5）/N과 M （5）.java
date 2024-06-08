import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] nums;
    static int N;
    static int M;
    static int[] check;
    static int[] sel;

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

        backtracking(0);
        bw.flush();
    }

    public static void backtracking(int target) throws IOException {
        if(target == M){
            for (int i = 0; i < M; i++) {
                bw.write(sel[i]+" ");
            }
            bw.write("\n");
        }else{
            for (int i = 0; i < N; i++) {
                if(check[i] == 0){
                    check[i] = 1;
                    sel[target] = nums[i];
                    backtracking(target+1);
                    check[i] = 0;
                }
            }
        }
    }
}