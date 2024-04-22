import java.io.*;
import java.util.ArrayDeque;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static ArrayDeque<String> stack = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if(s.length() > 1){
                stack.addLast(s.split(" ")[1]);
            }else{
                switch (s) {
                    case "2" : {
                        if (stack.isEmpty()) bw.write("-1");
                        else bw.write(stack.removeLast());

                        bw.write("\n");
                        break;
                    }
                    case "3" : {
                        bw.write(String.valueOf(stack.size()));

                        bw.write("\n");
                        break;
                    }
                    case "4" : {
                        if (stack.isEmpty()) bw.write("1");
                        else bw.write("0");

                        bw.write("\n");
                        break;
                    }
                    default : {
                        if (stack.isEmpty()) bw.write("-1");
                        else bw.write(stack.peekLast());

                        bw.write("\n");
                        break;
                    }
                }
            }
        }
        bw.flush();
    }
}