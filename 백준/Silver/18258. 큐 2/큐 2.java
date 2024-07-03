import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static ArrayDeque<Integer> queue = new ArrayDeque<>();
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        String s;
        int num;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            s = st.nextToken();

            if(s.equals("push")){
                num = Integer.parseInt(st.nextToken());
                queue.addLast(num);
            }else if(s.equals("front")){
                if(queue.isEmpty()) bw.write("-1\n");
                else bw.write(queue.peek()+"\n");
            }else if(s.equals("back")){
                if(queue.isEmpty()) bw.write("-1\n");
                else bw.write(queue.peekLast()+"\n");
            }else if(s.equals("size")){
                bw.write(queue.size()+"\n");
            }else if(s.equals("empty")){
                if(queue.isEmpty()) bw.write("1\n");
                else bw.write("0\n");
            }else if(s.equals("pop")){
                if(queue.isEmpty()) bw.write("-1\n");
                else bw.write(queue.removeFirst()+"\n");
            }
        }
        bw.flush();
    }
}



