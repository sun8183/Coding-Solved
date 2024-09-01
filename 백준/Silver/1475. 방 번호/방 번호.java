import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String N;
    static Map<String, Integer> map = new HashMap<>();
    static int answer;

    public static void main(String[] args) throws IOException {
        N = br.readLine();

        for (int i = 0; i < N.length(); i++) {
            String s = N.substring(i, i + 1);
            if(!s.equals("6")) map.put(s, map.getOrDefault(s, 0) + 1);
            else map.put("9", map.getOrDefault("9", 0) + 1);
        }

        map.put("9", (int)Math.ceil((double)map.getOrDefault("9", 0)/2));

        for (int i = 0; i < 10; i++) {
            if(map.getOrDefault(String.valueOf(i), 0) > answer) answer = map.get(String.valueOf(i));
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
