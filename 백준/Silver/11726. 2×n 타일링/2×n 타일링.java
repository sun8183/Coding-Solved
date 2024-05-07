import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] answer = {1, 2};

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        int sum = 0;
        if(N == 1) sum = answer[0];
        else if(N == 2) sum = answer[1];

        for (int i = 2; i < N; i++) {
            sum = answer[0] + answer[1];
            sum %= 10007;
            answer[0] = answer[1];
            answer[1] = sum;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
    }

}
