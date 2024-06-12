import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int A, B, C;
    public static void main(String[] args) throws IOException {
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());

        bw.write((A+B-C)+"\n");
        bw.write(Integer.parseInt(A+""+B)-C+"");

        bw.flush();
    }
}


