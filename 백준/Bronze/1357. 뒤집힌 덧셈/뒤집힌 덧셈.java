import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder x, y;
    static StringTokenizer st;
    static int sum;
    static String answer = "";
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        x = new StringBuilder(st.nextToken()).reverse();
        y = new StringBuilder(st.nextToken()).reverse();

        sum = Integer.parseInt(x.toString()) + Integer.parseInt(y.toString());

        while(sum > 0){
            if(!("".equals(answer) && sum%10 == 0)) answer += sum%10;
            sum /= 10;
        }

        bw.write(answer);
        bw.flush();
    }

}
