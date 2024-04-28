import java.io.*;
import java.util.ArrayDeque;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int K;

    static ArrayDeque<Integer> queue = new ArrayDeque<>();
    static String answer;
    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        K = Integer.parseInt(s.split(" ")[1]);

        for (int i = 1; i <= N; i++) {
            queue.addLast(i);
        }

        answer = "<";
        while(queue.size() > 1){

            for(int i=0; i<K-1; i++){
                queue.addLast(queue.removeFirst());
            }

            answer += queue.removeFirst() + ", ";
        }

        answer += queue.removeFirst() + ">";

        bw.write(answer);
        bw.flush();
    }
}