import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static ArrayDeque<Integer> data = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            int N = Integer.parseInt(br.readLine());
            String arr = br.readLine();
            arr = arr.replace("[", "");
            arr = arr.replace("]", "");
            
            StringTokenizer st = new StringTokenizer(arr, ",");
            for (int j = 0; j < N; j++) {
                data.addLast(Integer.parseInt(st.nextToken()));
            }

            int reverse = 1;
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == 'R'){
                    reverse *= -1;
                }else if(s.charAt(j) == 'D'){

                    if(!data.isEmpty()){
                        if(reverse == -1) data.removeLast();
                        else data.removeFirst();
                    }else {
                        flag = true;
                        break;
                    }
                }
            }

            if(flag) bw.write("error\n");
            else{
                bw.write("[");
                while(!data.isEmpty()){
                    if(reverse == 1) bw.write(String.valueOf(data.removeFirst()));
                    else bw.write(String.valueOf(data.removeLast()));

                    if(!data.isEmpty()) bw.write(",");

                }
                bw.write("]\n");
            }
        }

        bw.flush();
    }
}
