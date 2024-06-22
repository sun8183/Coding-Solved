import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] queen;

    static int answer;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        queen = new int[N];

        Queen(0);
        bw.write(String.valueOf(answer));
        bw.flush();
    }

    public static void Queen(int target){
        if(target == N){
            answer++;
        }else{
            for (int i = 0; i < N; i++) {
                queen[target] = i;

                if(isQueen(target)){
                    Queen(target+1);
                }
            }

        }
    }

    public static boolean isQueen(int target){  // 행은 확실하게 맞지 않음, 열과 대각선만 비교
        for (int i = 0; i < target; i++) {
            if(queen[target] == queen[i] || target - i == Math.abs(queen[target] - queen[i])){
                return false;
            }
        }
        return true;
    }
}