import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    static int T;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int yonsei = 0;
            int korea = 0;

            for (int j = 0; j < 9; j++) {
                st = new StringTokenizer(br.readLine());

                yonsei += Integer.parseInt(st.nextToken());
                korea += Integer.parseInt(st.nextToken());
            }

            if(yonsei > korea) bw.write("Yonsei");
            else if(yonsei == korea) bw.write("Draw");
            else bw.write("Korea");
            
            bw.write("\n");
        }

        bw.flush();
    }

}


