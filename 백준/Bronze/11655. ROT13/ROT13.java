import java.io.*;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;
    static String answer = "";

    public static void main(String[] args) throws IOException {
        s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char convert = ' ';

            if(c >= 'A' && c <= 'Z'){
                convert = (char)(c + 13);
                if(convert >'Z') convert = (char)(convert - 26);
            }else if(c >= 'a' && c <= 'z'){
                convert = (char)(c + 13);
                if(convert > 'z') convert = (char)(convert - 26);
            }else {
                convert = c;
            }

            answer += convert+"";
        }

        bw.write(answer);
        bw.flush();
    }
}
