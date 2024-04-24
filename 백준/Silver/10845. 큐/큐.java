import java.io.*;
import java.util.ArrayDeque;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static ArrayDeque<String> queue = new ArrayDeque<>();
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String s = br.readLine();

            if(s.contains("push")){
                queue.addLast(s.split(" ")[1]);
            }else if(s.contains("pop")){
                if(queue.isEmpty()) bw.write("-1");
                else bw.write(queue.removeFirst());

                bw.write("\n");
            }else if(s.contains("size")){
                bw.write(queue.size()+"");

                bw.write("\n");
            }else if(s.contains("empty")){
                if(queue.isEmpty()) bw.write("1");
                else bw.write("0");

                bw.write("\n");
            }else if(s.contains("front")){
                if(queue.isEmpty()) bw.write("-1");
                else bw.write(queue.peek());

                bw.write("\n");
            }else if(s.contains("back")){
                if(queue.isEmpty()) bw.write("-1");
                else bw.write(queue.peekLast());

                bw.write("\n");
            }
        }
        bw.flush();
    }
}