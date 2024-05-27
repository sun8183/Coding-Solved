import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int B;
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        N = Integer.parseInt(s.split(" ")[0]);
        B = Integer.parseInt(s.split(" ")[1]);

        while(N > 0){
            int nums = N % B;
            if(nums >= 10) answer.append((char)('A' + nums - 10));
            else answer.append(nums);
            N = N / B;
        }

        bw.write(answer.reverse().toString());
        bw.flush();
    }
}

