import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int K;
    static int answer;
    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        K = Integer.parseInt(s.split(" ")[1]);

        int num_1 = 1;
        int num_2 = 1;

        for(int i=N, j=1; i>K; i--, j++){
            num_1 *= i;
            num_2 *= j;
        }

        answer = num_1 / num_2;

        if(K == 0) answer = 1;

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}