import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static int answer;
    static HashMap<String, Integer> map_A = new HashMap<>();
    static HashMap<String, Integer> map_B = new HashMap<>();

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        for (int i = 0; i < N; i++) {
            map_A.put(st.nextToken(), 1);
        }

        s = br.readLine();
        st = new StringTokenizer(s);

        for (int i = 0; i < M; i++) {
            String str = st.nextToken();

            if (map_A.get(str) != null) {
                map_A.put(str, -1);
                map_B.put(str, -1);
            } else map_B.put(str, 1);
        }

        for (String str : map_A.keySet()){
            if(map_A.get(str) == 1) answer++;
        }

        for (String str : map_B.keySet()){
            if(map_B.get(str) == 1) answer++;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}

