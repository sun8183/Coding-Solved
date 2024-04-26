import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static HashMap<Integer, Integer> nums;

    static int M;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        nums = new HashMap<>();

        for(int i=0; i<N; i++) {
            nums.put(Integer.parseInt(st.nextToken()), 1);
        }

        M = Integer.parseInt(br.readLine());

        s = br.readLine();
        st = new StringTokenizer(s);

        for(int i=0; i<M; i++) {
            int num = Integer.parseInt(st.nextToken());

            if(nums.get(num) != null) bw.write("1");
            else bw.write("0");
            bw.write("\n");
        }

        bw.flush();

    }
}