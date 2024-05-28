import java.io.*;
import java.util.HashMap;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static int answer;
    static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        for (int i = 0; i < N+M; i++) {
            s = br.readLine();

            if(i < N) map.put(s, 1);
            else {
                if(map.get(s) != null) answer++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}

