import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static Map<Integer, Integer> map = new HashMap<>();
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                map.put(j, 1);
                map.put(i, 1);
                map.put(j*i, 1);
            }
        }

        bw.write(map.get(N) == null ? "0" : "1");
        bw.flush();
    }
}
