import java.io.*;
import java.util.HashMap;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        for (int i = 0; i < N; i++) {
            s = br.readLine();

            map.put(s.split(" ")[0], s.split(" ")[1]);
        }

        for (int i = 0; i < M; i++) {
            s = br.readLine();

            bw.write(map.get(s)+"\n");
        }

        bw.flush();
    }

}
