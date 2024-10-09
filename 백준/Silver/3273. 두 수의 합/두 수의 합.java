import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, X;
    static int[] arr;
    static StringTokenizer st;
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        X = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        int left = 0, right = N-1;

        while(left < right){
            int x1 = arr[left], x2 = arr[right];
            int sum = x1 + x2;

            if(sum == X) {
                answer++;
                left++;
                right--;
            }
            else if(sum < X) left++;
            else right--;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
