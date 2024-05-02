import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int []nums;

    static double avg;
    static int middle;
    static int many;
    static int range;
    static ArrayList<Integer> manyList = new ArrayList<>();

    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            avg+= nums[i];
        }

        avg /= N;
        Arrays.sort(nums);

        middle = nums[N/2];
        range = nums[N-1] - nums[0];

        int max = 1;

        for (int i = 0; i < N; i++) {
            if(map.get(nums[i]) == null) map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i])+1);

            if(max < map.get(nums[i])) {
                max = map.get(nums[i]);
            }
        }

        for (int i = 0; i < N; i++) {
            if(max == map.get(nums[i])) manyList.add(nums[i]);

        }

        Collections.sort(manyList);

        many = manyList.get(0);

        for (int i = 1; i < manyList.size(); i++) {

            if(many != manyList.get(i)) {
                many = manyList.get(i);
                break;
            }
        }

        bw.write(Math.round(avg)+"\n");
        bw.write(middle+"\n");
        bw.write(many+"\n");
        bw.write(range+"\n");
        bw.flush();
    }
}
