import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        int idx = 1;
        boolean flag = false;

        for (int i = 0; i < 2*N-1; i++) {
            for (int j = 0; j < idx; j++) {
                bw.write("*");
            }
            for (int j = idx; j < 2*N - idx; j++) {
                bw.write(" ");
            }

            for (int j = 0; j < idx; j++) {
                bw.write("*");
            }

            if(!flag) idx++;
            else idx--;

            if(idx == N) flag = true;
            bw.write("\n");
        }
        bw.flush();
    }
}
