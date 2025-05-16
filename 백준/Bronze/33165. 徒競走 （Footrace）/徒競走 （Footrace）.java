import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int t, v;

    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        v = Integer.parseInt(br.readLine());
        
        bw.write(String.valueOf(t*v));
        bw.flush();
    }
}













