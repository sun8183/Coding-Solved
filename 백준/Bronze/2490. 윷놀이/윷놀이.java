import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 3; i++) {
            String s = br.readLine();
            st = new StringTokenizer(s);

            int answer = 0;
            for (int j = 0; j < 4; j++) {
                if("1".equals(st.nextToken())) answer++;
            }

            if(answer == 0) bw.write("D");
            else if(answer == 1) bw.write("C");
            else if(answer == 2) bw.write("B");
            else if(answer == 3) bw.write("A");
            else if(answer == 4) bw.write("E");

            bw.write("\n");
        }


        bw.flush();
    }
}
