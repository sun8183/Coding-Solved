import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;

    static char [][] alpha;

    static int k = 8;
    
    static int answer = 1000_000_000;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        alpha = new char[N][M];

        // 배열 생성
        for(int i=0; i<N; i++){
            s = br.readLine();
            for(int j=0; j<s.length(); j++) alpha[i][j] = s.charAt(j);
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(i + k <= N && j+k <= M) {
                    answer = Math.min(answer, minMatrix(i, j));
                }
                else continue;
            }
        }
        
        bw.write(String.valueOf(answer));
        bw.flush();
    }
    
    public static int minMatrix(int w, int h){
        int w_start = 0;
        int b_start = 0;

        for(int i = w; i < k+w; i++){
            for(int j = h; j < k+h; j++){
                if(i % 2 == 0){
                    if(j % 2 == 0 && alpha[i][j] == 'B') w_start++;
                    else if(j % 2 == 1 && alpha[i][j] == 'W') w_start++;

                    if(j % 2 == 0 && alpha[i][j] == 'W') b_start++;
                    else if(j % 2 == 1 && alpha[i][j] == 'B') b_start++;

                }else{
                    if(j % 2 == 1 && alpha[i][j] == 'B') w_start++;
                    else if(j % 2 == 0 && alpha[i][j] == 'W') w_start++;

                    if(j % 2 == 1 && alpha[i][j] == 'W') b_start++;
                    else if(j % 2 == 0 && alpha[i][j] == 'B') b_start++;
                }
            }
        }

        return Math.min(b_start, w_start);
    }
}