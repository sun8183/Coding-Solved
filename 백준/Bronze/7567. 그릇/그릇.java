import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;
    static int answer = 10;
    public static void main(String[] args) throws IOException {
        s = br.readLine();

        for (int i = 1; i < s.length(); i++) {
            if('(' == s.charAt(i) && '(' == s.charAt(i-1)) answer+=5;
            else if(')' == s.charAt(i) && ')' == s.charAt(i-1)) answer += 5;
            else answer += 10;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}