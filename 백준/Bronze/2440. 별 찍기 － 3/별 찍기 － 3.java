import java.io.*;
import java.util.ArrayList;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            for(int j=n; j>i; j--) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
    }
}