import java.io.*;
public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static String s;
    static String target;

    public static void main(String[] args) throws IOException {
        s = br.readLine();
        target = br.readLine();

        if(s.length() < target.length()) bw.write("no");
        else bw.write("go");
        bw.flush();
    }
}
