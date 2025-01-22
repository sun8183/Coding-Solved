import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static int r, c;
    public static void main(String[] args) throws IOException {
        r = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
    }

}







