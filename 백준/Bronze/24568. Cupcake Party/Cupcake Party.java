import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int R, S, answer;
    public static void main(String[] args) throws IOException {
        R = Integer.parseInt(br.readLine());
        S = Integer.parseInt(br.readLine());

        answer = R * 8 + S * 3 - 28;
        bw.write(String.valueOf(answer));
        bw.flush();
    }

}







