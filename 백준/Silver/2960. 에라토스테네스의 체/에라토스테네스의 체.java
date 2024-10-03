import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, K;
    static boolean[] isPrime;
    static StringTokenizer st;
    static int num;
    static int idx = 1;
    static int answer;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        isPrime = new boolean[N+1];

        for (int i = 2; i < N+1; i++) {
            for (int j = i; j < N+1; j=i*idx) {
                if(!isPrime[j]){
                    num++;
                    answer = j;
                    isPrime[j] = true;
                    if(num == K){
                        i = N+1;
                        break;
                    }
                }
                idx++;
            }
            idx = 1;
        }


        bw.write(String.valueOf(answer));
        bw.flush();
    }

}