import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if(i%2!=0) bw.write(" ");
            for (int j = 0; j < N; j++) {
                bw.write("* ");
            }
            bw.write("\n");
        }
        bw.flush();
    }

}







