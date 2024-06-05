import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int M;
    static int[] sel;
    static int[] check;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);
        sel = new int[M];
        check = new int[N];

        backTracking(0, 0);

        bw.flush();
    }

    public static void backTracking(int nums, int start) throws IOException {
        if(nums == M){
            for (int i = 0; i < M; i++) {
                bw.write(sel[i]+" ");
            }
            bw.write("\n");
        }else {
            for (int i = start; i < N; i++) {
                if(check[i] == 0){
                    check[i] = 1;
                    sel[nums] = i+1;
                    backTracking(nums+1, i);
                    check[i] = 0;
                }
            }
        }
    }
}