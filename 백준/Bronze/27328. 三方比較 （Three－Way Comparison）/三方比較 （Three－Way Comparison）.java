import java.io.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int a, b;

    public static void main(String[] args) throws IOException {
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        if(a > b) bw.write("1");
        else if(a == b) bw.write("0");
        else bw.write("-1");
        bw.flush();
    }
}
