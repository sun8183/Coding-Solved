import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int answer;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            answer += (int)Math.pow(Integer.parseInt(s.charAt(i)+""),5);
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}









