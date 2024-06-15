import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                sb.append((s.charAt(i)+"").toLowerCase());
            }else{
                sb.append((s.charAt(i)+"").toUpperCase());
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}