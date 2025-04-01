import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    public static void main(String[] args) throws IOException {

        while((N = Integer.parseInt(br.readLine())) != 0){
            for (int i = 1; i <= N; i++) {
                for (int j = 0; j < i; j++) {
                    bw.write("*");
                }
                bw.write("\n");
            }
        }
        bw.flush();
    }
}












