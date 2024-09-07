import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, M;
    static int[] location;
    static StringTokenizer st;
    static int answer;
    static ArrayDeque<Integer> deque = new ArrayDeque<>();
    static ArrayDeque<Integer> temp;
    static int pick;
    static int now;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        location = new int[M];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            location[i] = Integer.parseInt(st.nextToken());
        }

        int now = 1;
        while(pick != M){
            if(now == location[pick]){
                pick++;
                deque.removeFirst();
            }else{
                int front = 0;
                int back = 0;
                temp = deque.clone();

                while(location[pick] != deque.peekFirst()){
                    deque.addLast(deque.removeFirst());
                    front++;
                }

                while(location[pick] != temp.peekFirst()){
                    temp.addFirst(temp.removeLast());
                    back++;
                }

                answer += Math.min(front, back);
                now = deque.peekFirst();
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
