import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static ArrayDeque<Integer> deque = new ArrayDeque<>();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        int num;
        int s;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());

            if(num == 1) {
                s = Integer.parseInt(st.nextToken());
                deque.addFirst(s);
            }else if(num == 2){
                s = Integer.parseInt(st.nextToken());
                deque.addLast(s);
            }else if(num == 3){
                if(deque.isEmpty()) bw.write("-1\n");
                else bw.write(deque.removeFirst()+"\n");
            }else if(num == 4){
                if(deque.isEmpty()) bw.write("-1\n");
                else bw.write(deque.removeLast()+"\n");
            }else if(num == 5){
                bw.write(deque.size()+"\n");
            }else if(num == 6){
                if(deque.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            }else if(num == 7){
                if(deque.isEmpty()) bw.write("-1\n");
                else bw.write(deque.peekFirst()+"\n");
            }else if(num == 8){
                if(deque.isEmpty()) bw.write("-1\n");
                else bw.write(deque.peekLast()+"\n");
            }
        }
        bw.flush();
    }
}



