import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int T, D, answer;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            D = Integer.parseInt(br.readLine());

            if(D%2!=0) answer++;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}













