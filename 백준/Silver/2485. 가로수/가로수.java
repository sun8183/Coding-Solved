import java.io.*;
import java.util.HashSet;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int []num = new int[2];

    static HashSet<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        num[0] = Integer.parseInt(br.readLine());
        num[1] = num[0];

        for (int i = 1; i < N; i++) {
            int tmp = Integer.parseInt(br.readLine());
            set.add(tmp - num[1]);
            num[1] = tmp;
        }

        int gcd = 0;

        for (Integer i : set) {
            if(gcd == 0) gcd = i;
            else {
                gcd = Math.min(gcd, gcd(gcd, i));
                if(gcd == 1) break;
            }
        }

        bw.write(String.valueOf((num[1]-num[0])/gcd-N + 1));
        bw.flush();
    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        else return gcd(b, a % b);
    }
}
