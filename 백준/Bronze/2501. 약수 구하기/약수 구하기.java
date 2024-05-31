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

        for (int i = 1; i <= N; i++) {
            if(N%i == 0){
                answer++;
            }

            if(answer == K) {
                bw.write(String.valueOf(i));
                break;
            }
        }

        if(answer < K) bw.write("0");

        bw.flush();
    }
}

