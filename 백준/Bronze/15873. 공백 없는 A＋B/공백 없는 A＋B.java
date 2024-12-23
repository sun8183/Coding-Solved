import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;
    static int answer;

    public static void main(String[] args) throws IOException {
        s = br.readLine();

        if(s.charAt(0) == '1' && s.charAt(1) == '0') answer += Integer.parseInt(s.substring(0, 2)) +Integer.parseInt(s.substring(2));
        else answer += Integer.parseInt(s.substring(0, 1)) +Integer.parseInt(s.substring(1));

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}




