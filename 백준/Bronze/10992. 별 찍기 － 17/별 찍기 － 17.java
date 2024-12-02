import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());


        int idx = 0;
        for (int i = 0; i < N; i++) {
            if(i == N-1){
                for (int j = 0; j < N*2-1; j++) {
                    bw.write("*");
                }
            }else{
                for (int j = 1; j <= N*2-1; j++) {
                    if(j == N-idx || j == N+idx) bw.write("*");
                    else if(j < N+idx)bw.write(" ");
                }
            }
            idx++;
            bw.write("\n");
        }
        bw.flush();
    }

}

