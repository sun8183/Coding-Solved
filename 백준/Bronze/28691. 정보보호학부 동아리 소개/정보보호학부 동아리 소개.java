import java.io.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static String s;

    public static void main(String[] args) throws IOException {
        s = br.readLine();

        if("M".equals(s)) bw.write("MatKor");
        else if("W".equals(s)) bw.write("WiCys");
        else if("C".equals(s)) bw.write("CyKor");
        else if("A".equals(s)) bw.write("AlKor");
        else if("$".equals(s)) bw.write("$clear");
        bw.flush();
    }
}
