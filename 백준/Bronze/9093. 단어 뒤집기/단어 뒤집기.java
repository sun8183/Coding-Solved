import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int T;
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            while(st.hasMoreElements()){
                String s = st.nextToken();

                for (int j = s.length() -1; j >= 0; j--) {
                    bw.write(String.valueOf(s.charAt(j)));
                }
                bw.write(" ");
            }

            bw.write("\n");
        }

        bw.flush();
    }

}