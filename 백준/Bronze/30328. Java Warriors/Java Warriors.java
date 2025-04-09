import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int answer;
    static String s;

    public static void main(String[] args) throws IOException {
        answer = Integer.parseInt(br.readLine());
        
        bw.write(String.valueOf(answer * 4000));
        bw.flush();
    }
}












