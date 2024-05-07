import java.io.*;
import java.util.HashMap;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static HashMap<String, Integer> map_s = new HashMap<>();
    static HashMap<Integer, String> map_i = new HashMap<>();
    
    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        for (int i = 1; i <= N; i++) {
            s = br.readLine();
            map_s.put(s, i);
            map_i.put(i, s);
        }

        for (int i = 0; i < M; i++) {
            s = br.readLine();

            String answer = "";
            if(map_s.get(s) == null) answer = map_i.get(Integer.parseInt(s));
            else answer = map_s.get(s)+"";

            bw.write(answer+"\n");
        }
        bw.flush();
    }

}
