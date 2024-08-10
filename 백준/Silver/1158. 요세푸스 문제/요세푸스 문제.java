import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N, K;
    static String s;
    static StringTokenizer st;

    static ArrayDeque<Integer> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {

        s = br.readLine();
        st = new StringTokenizer(s);

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            queue.addLast(i);
        }

        int num = 0;

        bw.write("<");
        while(!queue.isEmpty()){
            num++;
            if(num == K) {
                bw.write(String.valueOf(queue.removeFirst()));
                if(!queue.isEmpty()) bw.write(", ");
                num = 0;
            }else {
                queue.addLast(queue.removeFirst());
            }
        }
        bw.write(">");

        bw.flush();
    }
}
