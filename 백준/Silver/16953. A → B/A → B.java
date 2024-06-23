import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int A, B;
    static int answer = -1;
    static final int MAX = Integer.MAX_VALUE / 10 ;
    static ArrayDeque<int[]> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        queue.addLast(new int[]{A, 1});

        while(!queue.isEmpty()){
            int[] current = queue.removeFirst();

            int t_a = current[0] > MAX* 2 ? B+1 : current[0] * 2;
            int t_b = current[0] > MAX ? B+1 : Integer.parseInt(current[0]+"1");

            if(B == t_a || B == t_b) {
                answer = current[1] + 1;
                queue.clear();
            }
            else{
                if(t_a < B) queue.addLast(new int[]{t_a, current[1] + 1});
                if(t_b < B) queue.addLast(new int[]{t_b, current[1] + 1});
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}