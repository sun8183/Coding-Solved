import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int answer;
    
    public static void main(String[] args) throws IOException {
        answer = Integer.parseInt(br.readLine());

        for (int i = 0; i < 9; i++) {
            answer -= Integer.parseInt(br.readLine());
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}