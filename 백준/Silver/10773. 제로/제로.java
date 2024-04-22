import java.io.*;
import java.util.ArrayDeque;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static ArrayDeque<Integer> stack = new ArrayDeque<>();
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if(!"0".equals(s)) stack.addLast(Integer.parseInt(s));
            else stack.removeLast();
        }

        while(!stack.isEmpty()){
            answer += stack.removeLast();
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}