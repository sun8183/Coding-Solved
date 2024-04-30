import java.io.*;
import java.util.HashMap;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static HashMap<String, Integer> alpha = new HashMap<>();
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i <26; i++) {
            alpha.put(String.valueOf((char)('a'+i)), i+1);
        }

        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            answer += alpha.get(String.valueOf(s.charAt(i))) * Math.pow(31, i);
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}