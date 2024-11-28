import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;

    public static void main(String[] args) throws IOException {
        s = br.readLine();

        int mod = 20000303;
        
        long answer = 0;
        for (int i = 0; i < s.length(); i++) {
            answer = (answer * 10 + (s.charAt(i) - '0')) % mod;
        }
        
        bw.write(String.valueOf(answer));
        bw.flush();
    }

}

