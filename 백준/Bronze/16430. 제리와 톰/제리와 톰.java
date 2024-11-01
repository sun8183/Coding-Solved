import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int A, B;
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        
        bw.write((B-A)+" "+B);
        bw.flush();
    }
}
