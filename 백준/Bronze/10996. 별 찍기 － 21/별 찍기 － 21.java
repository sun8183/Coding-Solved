import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N*2; i++) {
            sb = new StringBuilder();
            if(i%2!=0) sb.append(" ");
            for (int j = 0; j < N; j++) {
                if(j%2==0) sb.append("*");
                else sb.append(" ");
            }

            bw.write(sb.substring(0, N));
            bw.write("\n");
        }
        bw.flush();
    }

}







