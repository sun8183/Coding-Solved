import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        int idx = 0;
        int rev = 0;

        for (int i = 0; i < 2*N-1; i++) {
            for (int j = 0; j < idx; j++){
                bw.write(" ");
            }

            for (int j = 2*N - idx*2 -1; j > 0 ; j--) {
                bw.write("*");
            }
            
            if(idx == N-1){
                rev = 1;
            }

            if(rev == 1) idx --;
            else idx++;

            bw.write("\n");
        }
        bw.flush();
    }
}
