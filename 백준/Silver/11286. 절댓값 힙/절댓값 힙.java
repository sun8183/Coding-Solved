import java.io.*;
import java.util.PriorityQueue;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n;
    static PriorityQueue<Integer> plus = new PriorityQueue<Integer>();
    static PriorityQueue<Integer> minus = new PriorityQueue<Integer>();

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if(x == 0) {
                if(plus.isEmpty() && minus.isEmpty()) bw.write("0\n");
                else {  // 절댓값 큰수 계산하기
                    if(plus.isEmpty()){
                        bw.write((-1 * minus.poll()) + "\n");
                    }else if(minus.isEmpty()){
                        bw.write(plus.poll() + "\n");
                    }else if(plus.peek() >= minus.peek()){
                        bw.write((-1 * minus.poll())+ "\n");
                    }else {
                        bw.write(plus.poll() + "\n");
                    }
                }
            }else{
                if(x < 0) minus.offer(Math.abs(x));
                else plus.offer(Math.abs(x));
            }
        }

        bw.flush();
    }
}