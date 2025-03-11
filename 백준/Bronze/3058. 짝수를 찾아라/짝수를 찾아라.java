import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int T;
    static StringTokenizer st;
    static int answer = 0;
    static int min = 100;
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            answer = 0;
            min = 100;
            for (int j = 0; j < 7; j++) {
                int num = Integer.parseInt(st.nextToken());

                if(num%2==0) {
                    answer += num;
                    min = Math.min(min, num);
                }
            }

            bw.write(answer+" "+min+"\n");
        }

        bw.flush();
    }
}









