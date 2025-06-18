import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int answer;

    public static void main(String[] args) throws IOException {
        answer += Integer.parseInt(br.readLine()) * 3;
        answer += Integer.parseInt(br.readLine()) * 4;
        answer += Integer.parseInt(br.readLine()) * 5;
        
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}














