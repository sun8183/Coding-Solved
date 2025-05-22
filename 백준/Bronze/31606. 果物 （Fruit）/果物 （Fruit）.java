import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int answer = 3;

    public static void main(String[] args) throws IOException {
        answer += Integer.parseInt(br.readLine());
        answer += Integer.parseInt(br.readLine());

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}













