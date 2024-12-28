import java.io.*;
import java.util.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringTokenizer st;
    static int round;
    static int answer1 = 100, answer2 = 100;

    public static void main(String[] args) throws IOException {
        round = Integer.parseInt(br.readLine());

        for (int i = 0; i < round; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a > b){
                answer2 -= a;
            }else if(b > a){
                answer1 -= b;
            }
        }

        bw.write(answer1 + "\n");
        bw.write(String.valueOf(answer2));
        bw.flush();
    }
}
