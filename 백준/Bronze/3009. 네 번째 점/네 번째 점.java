import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static HashMap<Integer, Integer> x = new HashMap<>();
    static HashMap<Integer, Integer> y = new HashMap<>();

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 3; i++) {
            String s = br.readLine();
            int[] nums = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();

            if(x.get(nums[0]) == null){
                x.put(nums[0], 1);
            }else{
                x.put(nums[0], x.get(nums[0])+1);
            }

            if(y.get(nums[1]) == null){
                y.put(nums[1], 1);
            }else{
                y.put(nums[1], y.get(nums[1])+1);
            }
        }

        for(Integer key : x.keySet()) {
            if(x.get(key) == 1) bw.write(String.valueOf(key));
        }

        bw.write(" ");

        for(Integer key : y.keySet()) {
            if(y.get(key) == 1) bw.write(String.valueOf(key));
        }

        bw.flush();
    }
}

