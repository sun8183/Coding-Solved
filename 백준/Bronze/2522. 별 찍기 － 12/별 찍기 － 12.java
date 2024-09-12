import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        int idx = N-1;
        boolean flag = false;
        for (int i = 0; i < 2*N-1; i++) {
            for (int j = 0; j < idx; j++) {
                bw.write(" ");
            }
            for (int j = idx; j < N; j++) {
                bw.write("*");
            }

            if(idx == 0) flag = true;

            if(flag) idx++;
            else idx--;

            bw.write("\n");
        }
        bw.flush();
    }
}
