import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] nums;
    static StringTokenizer st;
    static ArrayDeque<Integer> stack = new ArrayDeque<>();
    static int idx = 1;
    static String answer = "Nice";

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && stack.peekLast() == idx) {
                stack.removeLast();
                idx++;
            }

            if (nums[i] == idx) {
                idx++;
            } else {
                stack.addLast(nums[i]);
            }
        }

        while(!stack.isEmpty()){
            if(stack.peekLast() == idx){
                stack.removeLast();
                idx++;
            }else {
                answer = "Sad";
                break;
            }
        }

        bw.write(answer);
        bw.flush();
    }
}



