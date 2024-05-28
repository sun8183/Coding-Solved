import java.io.*;
import java.util.HashSet;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        int idx;
        for (int i = 0; i < s.length(); i++) {
            idx = i+1;
            for (int j = 0; j < s.length(); j++) {
                if(j+idx > s.length()) continue;
                set.add(s.substring(j, j+idx));
            }
        }

        bw.write(String.valueOf(set.size()));
        bw.flush();
    }
}

