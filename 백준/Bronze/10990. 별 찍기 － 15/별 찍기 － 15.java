import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, trim1, trim2;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        trim1 = N-1;
        trim2 = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < trim1; j++) {
                bw.write(" ");
            }
            bw.write("*");
            for (int j = 0; j < trim2; j++) {
                bw.write(" ");
            }
            if(i != 0) {
                bw.write("*");
            }

            trim1--;
            if(trim2 == 0) trim2 = 1;
            else trim2+=2;

            bw.write("\n");
        }
        bw.flush();
    }

}








