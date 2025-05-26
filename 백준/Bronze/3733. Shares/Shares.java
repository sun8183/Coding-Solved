import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        while((s = br.readLine()) != null){
            st = new StringTokenizer(s);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            bw.write(b / (a+1)+"\n");
        }
        bw.flush();
    }
}














