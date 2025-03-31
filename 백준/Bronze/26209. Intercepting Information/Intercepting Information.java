import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    static boolean b;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 8; i++) {
            int s = Integer.parseInt(st.nextToken());
            
            if(s == 9) {
                b = true;
                bw.write("F");
                break;
            }
        }
        
        if(!b) bw.write("S");
        
        bw.flush();
    }
}












