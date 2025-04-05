import java.io.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T, answer;
    static String s;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            s = br.readLine();

            if(Integer.parseInt(s.substring(2)) <= 90) answer++;

        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
