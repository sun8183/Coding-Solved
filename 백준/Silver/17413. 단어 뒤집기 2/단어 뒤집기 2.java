import java.io.*;
import java.util.ArrayDeque;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;
    static StringBuilder answer = new StringBuilder();
    static ArrayDeque<String> stack = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        s = br.readLine();

        boolean isTag = false;

        for (int i = 0; i < s.length(); i++) {
            stack.addLast(s.charAt(i)+"");
            if(s.charAt(i) == '<') {
                stack.removeLast();
                while(!stack.isEmpty()){
                    String ch = stack.removeLast();
                    if(!ch.equals(" ")) answer.append(ch);
                }
                isTag = true;
                stack.addLast(s.charAt(i)+"");
            }
            if(s.charAt(i) == '>'){
                while(!stack.isEmpty()){
                    answer.append(stack.removeFirst());
                    isTag = false;
                }
            }

            if(s.charAt(i) == ' '){
                if(!isTag){
                    while(!stack.isEmpty()){
                        String ch = stack.removeLast();
                        if(!ch.equals(" ")) answer.append(ch);
                    }
                    answer.append(" ");
                }
            }
        }

        while(!stack.isEmpty()){
            answer.append(stack.removeLast());
        }

        bw.write(answer.toString());
        bw.flush();
    }

}




