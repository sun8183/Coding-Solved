import java.io.*;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static int N;
    static HashMap<String, Integer> map;
    static HashSet<String> set;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            map = new HashMap<>();
            set = new HashSet<>();
            for (int j = 0; j < N; j++) {
                String s = br.readLine();
                String wear = s.split(" ")[1];

                if(map.get(wear) == null) map.put(wear, 2);
                else map.put(wear, map.get(wear)+1);

                set.add(wear);
            }

            int answer = 1;

            for (String s : set) {
                answer *= map.get(s);
            }

            bw.write((answer-1)+"\n");
        }
        bw.flush();
    }
}
