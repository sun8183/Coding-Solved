import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static String s;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        while(!(s = br.readLine()).equals("# 0 0")){
            st = new StringTokenizer(s);
            bw.write(st.nextToken()+" ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(x > 17 || y >= 80) bw.write("Senior");
            else bw.write("Junior");

            bw.write("\n");
        }
        bw.flush();
    }
}
