import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    static int a, b, chicken;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        chicken = Integer.parseInt(br.readLine());
        
        if(a+b >= 2*chicken) bw.write(String.valueOf(a+b - 2*chicken));
        else bw.write(String.valueOf(a+b));

        bw.flush();
    }

}







