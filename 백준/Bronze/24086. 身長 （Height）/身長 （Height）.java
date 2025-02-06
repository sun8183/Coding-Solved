import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int A, B;

    public static void main(String[] args) throws IOException {
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        
        bw.write(String.valueOf(B-A));
        bw.flush();
    }

}







