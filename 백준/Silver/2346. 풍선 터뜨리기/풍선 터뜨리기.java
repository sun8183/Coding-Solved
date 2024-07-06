import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] nums;
    static StringTokenizer st;
    static ArrayDeque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        nums = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            deque.addLast(i);
        }

        int current = nums[deque.removeFirst()];
        bw.write("1 ");

        while (!deque.isEmpty()) {
            if (current > 0) {
                for (int i = 1; i < current; i++) {  // current-1 만큼 앞으로 이동
                    deque.addLast(deque.removeFirst());
                }
                current = nums[deque.peekFirst()];
                bw.write(deque.removeFirst() + " ");
            } else {
                for (int i = current; i < 0; i++) {  // -current 만큼 뒤로 이동
                    deque.addFirst(deque.removeLast());
                }
                current = nums[deque.peekFirst()];
                bw.write(deque.removeFirst() + " ");
            }
        }

        bw.flush();
    }
}
