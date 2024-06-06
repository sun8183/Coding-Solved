import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static int[] sel;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        sel = new int[M];      // 선택된 값을 넣는 배열 (N개 중 M개를 선택)

        backTracking(0);
        bw.flush();
    }

    public static void backTracking(int nums) throws IOException {
        if(nums == M) {
            for (int i = 0; i < M; i++) {
                bw.write(sel[i]+" ");
            }
            bw.write("\n");
        }
        else{
            for (int i = 0; i < N; i++) {
                sel[nums] = i+1;
                backTracking(nums+1);
            }
        }
    }

}