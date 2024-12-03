import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static StringTokenizer st;
    static int answer;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            answer = Math.max(answer, price(a, b, c));
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

    public static int price(int a, int b, int c){
        int price;

        if(a == b && b == c) price = 10000 + a * 1000;
        else if (a == b || b == c || a == c) {
            if (a == b || a == c) price = 1000 + 100 * a;
            else price = 1000 + 100 * b;
        }
        else {
            price = Math.max(Math.max(a, b), c) * 100;
        }

        return price;
    }

}

