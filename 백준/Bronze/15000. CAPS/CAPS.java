import java.io.*;
import java.util.Locale;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        bw.write(br.readLine().toUpperCase(Locale.ROOT));
        bw.flush();
    }

}







