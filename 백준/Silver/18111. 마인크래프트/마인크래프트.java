import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static int B;

    static int[][] nums;

    static int[] answer;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);
        B = Integer.parseInt(s.split(" ")[2]);

        int max_height = 0;

        nums = new int[N][M];

        for(int i=0; i< N; i++){
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            for (int j = 0; j < M; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());

                if(max_height < nums[i][j]) max_height = nums[i][j];
            }
        }
        answer = answer(0);

        for(int i=1; i<=max_height; i++){
            int[] brute = answer(i);
            if(brute[0] != -1){
                if(brute[0] < answer[0]) answer = brute;
                else if(brute[0] == answer[0]){
                    if(brute[1] > answer[1]) answer = brute;
                }
            }
        }

        bw.write(answer[0]+" "+answer[1]);
        bw.flush();
    }

    public static int[] answer(int height){
        int[] result = new int[2];
        int b = B;
        int sec = 0;

        for(int i=0; i<N; i++){
            for (int j = 0; j < M; j++) {
                if(height > nums[i][j]){
                    sec += height - nums[i][j] ;
                    b -= height - nums[i][j];
                }else if(height < nums[i][j]){
                    sec += 2 * (nums[i][j] - height);
                    b += nums[i][j] - height;
                }
            }
        }

        if(b >= 0){
            result[0] = sec;
            result[1] = height;
        }else{
            result[0] = -1;
            result[1] = height;
        }

        return result;
    }
}