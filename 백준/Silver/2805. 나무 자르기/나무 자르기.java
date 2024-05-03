import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static long h;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        n = Integer.parseInt(st.nextToken()); // n : 1 ~ 10000..
        h = Integer.parseInt(st.nextToken()); // M : 1 ~ 100000...

        s = br.readLine();
        st = new StringTokenizer(s);

        long [] target = new long[n];
        long answer = 0;

        for(int i=0; i<n; i++){
            target[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(target);

        long temp = 0;
        long max = target[n-1];
        long min = 0;
        long mid;

        while(min <= max){
            temp = 0;
            mid = min + (max - min) / 2;

            // 나무가 깎이는 것을 확인하는 코드
            for(int i = n-1; i >= 0; i--){
                if(target[i] > mid ) temp += target[i] - mid;
            }

            if(temp < h) {
                max = mid - 1;
            }else {
                answer = mid;
                min = mid + 1;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}

