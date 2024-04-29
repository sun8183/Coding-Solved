import java.io.*;
import java.util.ArrayDeque;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static ArrayDeque<String> stack = new ArrayDeque<>();

    static String[] answer = {"yes", "no"};
    static boolean flag = false;

    public static void main(String[] args) throws IOException {
        String s = "";

        while(true){
            s = br.readLine();
            if(s.equals(".")) break;
            
            flag = false;
            stack.clear();

            for(int i=0; i< s.length(); i++){
                if('(' == s.charAt(i) || '[' == s.charAt(i)) stack.addLast(s.charAt(i)+"");
                else if(')' == s.charAt(i) || ']' == s.charAt(i)){
                    if(stack.isEmpty()) {
                        flag = true;
                    }
                    else {
                        if(')' == s.charAt(i) && stack.peekLast().equals("(")){
                            stack.removeLast();
                        }else if(']' == s.charAt(i) && stack.peekLast().equals("[")){
                            stack.removeLast();
                        }else {
                            flag = true;
                        }
                    }
                }
            }


            if(!flag && stack.isEmpty()) bw.write(answer[0]);
            else bw.write(answer[1]);

            bw.write("\n");

        }

        bw.flush();
    }
}