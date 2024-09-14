import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        int count = 0;
        char prev = s.charAt(0);
        boolean flag = false;

        for (int i = 1; i < s.length(); i++) {
            if(prev != s.charAt(i) && !flag) {
               flag = true;
               count++;
            }else if(prev == s.charAt(i)) flag =false;
        }

        bw.write(String.valueOf(count));

        bw.flush();
    }
}

