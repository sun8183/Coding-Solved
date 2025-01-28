import java.io.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringBuilder sb;
    
    public static void main(String[] args) throws IOException {
        sb = new StringBuilder(br.readLine());
        
        bw.write(sb.reverse().toString());
        bw.flush();
    }
}
