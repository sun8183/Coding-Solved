import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringTokenizer st;
    static int N, M;
    static int [] arr;
    static int front, tail, answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        front = 0;
        tail = N-1;

        Arrays.sort(arr);

        while(front < tail){
            int sum = arr[front] + arr[tail];
            if(sum > M) tail--;
            else if(sum < M) front++;
            else {
                answer++;
                front++;
                tail--;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
