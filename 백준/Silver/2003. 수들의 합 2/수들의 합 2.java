import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] arr;
    static long[] cache;
    static int N;
    static long M;
    static StringTokenizer st;
    static int answer;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        cache = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(i > 0){
                if(i == 1) cache[i-1] = arr[i-1];
                cache[i] = cache[i-1] + arr[i];
            }
        }
        
        if(cache[0] == 0) cache[0] = arr[0];

        int idx = 0;

        for (int i = 0; i < N; i++) {
            if(cache[i] > M){
                if(cache[i] - cache[idx] > M) {
                    idx++;
                    i--;
                }
                else if(cache[i] - cache[idx] == M) answer++;
            }else if(cache[i] == M) answer++;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}