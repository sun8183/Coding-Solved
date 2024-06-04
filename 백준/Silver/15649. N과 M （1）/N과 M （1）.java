import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static int[] sel;
    static int[] check;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        sel = new int[M];      // 선택된 값을 넣는 배열 (N개 중 M개를 선택)
        check = new int[N];    // 체크된 값이 들어가 있지 확인하는 배열 (N개만큼 필요)

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
                if(check[i] == 0){
                    check[i] = 1;
                    sel[nums] = i+1;
                    backTracking(nums+1);
                    check[i] = 0;
                }
            }
        }
    }

}