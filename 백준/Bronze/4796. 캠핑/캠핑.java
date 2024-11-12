import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int L, P, V;
    static String s;
    static StringTokenizer st;
    static int answer;
    static int idx = 0;

    public static void main(String[] args) throws IOException {
        while(!"0 0 0".equals(s = br.readLine())){
            idx++;
            st = new StringTokenizer(s);

            L = Integer.parseInt(st.nextToken());
            P = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());

            answer = V / P * L + (Math.min(V % P, L));
            bw.write("Case "+idx+": "+answer+"\n");
        }

        bw.flush();
    }

}
