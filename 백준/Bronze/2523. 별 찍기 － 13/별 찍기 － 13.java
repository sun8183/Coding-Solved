import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, idx;
    
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 2*N-1; i++) {
            if(i > N) idx--;
            else idx++;

            for (int j = 0; j < idx; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }


        bw.flush();
    }
}
