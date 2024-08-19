import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String s;
        while((s = br.readLine()) != null){
            bw.write(s);
            bw.write("\n");
        }
        bw.flush();
    }
}
