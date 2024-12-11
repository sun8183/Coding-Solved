import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    static int a,b,c,d;
    static int answer;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        answer += Math.min(a+d, b+c);

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}




