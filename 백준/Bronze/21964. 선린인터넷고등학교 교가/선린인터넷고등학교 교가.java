import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;

    public static void main(String[] args) throws IOException {
        s = br.readLine();
        s = br.readLine();


        bw.write(s.substring(s.length()-5));
        bw.flush();
    }
}












