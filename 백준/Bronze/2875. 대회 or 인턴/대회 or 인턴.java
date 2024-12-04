import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    static int N, M, K;
    static int answer;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        while(true){
            if(N >= 2 && M >= 1) {
                N -= 2;
                M -= 1;
                answer ++;
            }else break;
        }

        K -= (N + M);

        while(K > 0){
            answer --;
            K -= 3;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}

