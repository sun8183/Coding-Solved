import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;

    public static void main(String[] args) throws IOException {
        s = br.readLine();

        if(s.charAt(0) == s.charAt(1)) bw.write("1");
        else bw.write("0");
        bw.flush();
    }
}













