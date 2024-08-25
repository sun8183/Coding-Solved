import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int T, N;
    static boolean[] prime = new boolean[10001];

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());
        prime();
        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            int left = 0;
            int right = 0;
            int middle = N/2;

            for (int j = middle; j >= 2; j--) {
                if(!prime[j]){
                    for (int k = N; k >= 2; k--) {
                        if(!prime[k]){
                            if(j+k == N){
                                left = j;
                                right = k;
                                j = 0;
                                break;
                            }else if(j+k < N) break;
                        }
                    }
                }
            }

            bw.write(left+" "+right+"\n");
        }
        bw.flush();
    }

    public static void prime() {
        for (int i = 2; i < prime.length; i++) {
            if(!prime[i]) {
                for (int j = i*2; j < prime.length; j+=i) {
                    prime[j] = true;
                }
            }
        }
    }

}
