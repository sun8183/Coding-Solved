import java.io.*;
import java.util.ArrayDeque;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            answer += isGoodWord(br.readLine());
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

    public static int isGoodWord(String s) {
        int result = 0;
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()) stack.addLast(s.charAt(i)+"");
            else{
                if(stack.peekLast().equals(s.charAt(i)+"")) stack.removeLast();
                else stack.addLast(s.charAt(i)+"");
            }
        }

        if(stack.isEmpty()) result = 1;
        return result;
    }
}
