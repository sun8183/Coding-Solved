import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static long N, M;
    static long answer;
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        answer = N - M;
        if(answer < 0) answer *= -1;

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}



