import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static int n;
    static int k;
    static int[][] apt;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());

            apt = new int[k+1][n];

            for(int j=0; j<k+1; j++) apt[j][0] = 1;
            for(int j=0; j<n; j++) apt[0][j] = j+1;

            for (int j = 1; j < k+1; j++) {
                for (int l = 1; l < n; l++) {
                    apt[j][l] = apt[j][l-1] + apt[j-1][l];
                }

            }
            bw.write(String.valueOf(apt[k][n-1])+"\n");
        }
        bw.flush();
    }
}