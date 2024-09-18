import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int a;
    static int b;
    static StringTokenizer st;
    static int[] cache;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        cache = new int[1001];
        arr = new int[1001];

        int num = 2;
        int count = 0;

        cache[0] = 1;
        arr[0] = 1;
        
        for (int i = 1; i <= 1000; i++) {
            cache[i] = cache[i-1] + num;
            arr[i] = num;
            count++;

            if(num == count){
                num++;
                count = 0;
            }
        }

        if(a == b) bw.write(String.valueOf(arr[a-1]));
        else bw.write(String.valueOf(cache[b-1] - cache[a-1] + arr[a-1]));

        bw.flush();
    }
}

