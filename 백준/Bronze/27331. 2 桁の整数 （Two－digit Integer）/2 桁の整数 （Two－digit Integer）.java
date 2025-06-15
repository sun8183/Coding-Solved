import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static String a, b;

    public static void main(String[] args) throws IOException {
        a = br.readLine();
        b = br.readLine();

        bw.write(a+b);
        bw.flush();
    }
}














