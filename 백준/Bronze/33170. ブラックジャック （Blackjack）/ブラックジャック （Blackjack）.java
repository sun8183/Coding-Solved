import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int answer;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 3; i++) {
            answer += Integer.parseInt(br.readLine());
        }

        if(answer <= 21) bw.write("1");
        else bw.write("0");

        bw.flush();
    }
}













