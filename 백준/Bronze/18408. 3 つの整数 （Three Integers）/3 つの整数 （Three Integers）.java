import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int one, two;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            if(st.nextToken().equals("1")) one++;
            else two++;
        }

        if(one > two) bw.write("1");
        else bw.write("2");
        bw.flush();
    }
}













