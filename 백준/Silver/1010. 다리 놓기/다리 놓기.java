import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static int[][] nums;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        int N;
        int M;
        for (int i = 0; i < T; i++) {
            String s = br.readLine();

            N = Integer.parseInt(s.split(" ")[0]);
            M = Integer.parseInt(s.split(" ")[1]);

            nums = new int[N+1][M+1];

            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= M; k++) {
                    if(j == 1){
                        nums[j][k] = k;
                    }
                    else{
                        for (int l = 1; l <=k; l++) {
                            nums[j][k] += nums[j - 1][k-l];
                        }
                    }
                }
            }

            bw.write(nums[N][M]+"\n");
        }
        bw.flush();
    }
}