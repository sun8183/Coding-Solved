import java.io.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static String s;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            char c = (char)((int)s.charAt(i) - 3);

            if(c < 'A') {
                c = (char)(c + 26);
            }
            sb.append(c);
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
