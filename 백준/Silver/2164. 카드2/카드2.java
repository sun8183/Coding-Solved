import java.io.*;
import java.util.ArrayDeque;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static ArrayDeque<Integer> queue;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int answer = 0;

        queue = new ArrayDeque<>();
        for (int i = 1; i <= Integer.parseInt(s); i++) {
            queue.addLast(Integer.parseInt(i+""));
        }

        while(!queue.isEmpty()){
            answer = queue.removeFirst();

            if(!queue.isEmpty()) queue.addLast(queue.removeFirst());
        }

        bw.write(String.valueOf(answer));
        bw.flush();

    }
}