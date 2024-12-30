import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static Map<String, Integer> map = new HashMap<String, Integer>();
    static int answer;
    static String s;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if(!map.containsKey(s)) map.put(s, 1);
            else map.put(s, map.get(s)+1);
        }

        for (String key : map.keySet()) {
            if(answer < map.get(key)){
                s = key;
                answer = map.get(key);
            }else if(answer == map.get(key)){
                s = s.compareTo(key) < 0 ? s : key;
            }
        }

        bw.write(s);
        bw.flush();
    }
}
