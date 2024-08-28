import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int answer;
    static int[] calc = {500, 100, 50, 10, 5, 1};
    
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        int result = 1000 - N;
        for (int i = 0; i < calc.length ; i++) {
            answer += result/calc[i];
            result %= calc[i];
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
