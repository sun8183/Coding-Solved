import java.io.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int a, b, answer;

    public static void main(String[] args) throws IOException {
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        if(a >= 20 && a <= 23) answer += 24 - a + b;
        else answer += b - a;
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
