import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int Y, M;

    public static void main(String[] args) throws IOException {
        Y = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        bw.write(M + (M - Y)+"");
        bw.flush();
    }

}




