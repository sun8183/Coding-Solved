import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] nums;
    static int[] nums_sort;
    static HashSet<Integer> set = new HashSet<>();
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            set.add(nums[i]);
        }

        int idx = 0;

        nums_sort = new int[set.size()];

        for (Integer i : set) {
            nums_sort[idx++] = i;
        }

        Arrays.sort(nums_sort);

        int num=0;
        for (int i = 0; i < nums_sort.length; i++) {

            map.put(nums_sort[i], num);
            num++;
        }

        for (int i = 0; i < nums.length; i++) {
            bw.write(map.get(nums[i])+" ");
        }


        bw.flush();
    }

}
