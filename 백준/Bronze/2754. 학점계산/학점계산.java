import java.io.*;
import java.util.HashMap;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String N;
    static HashMap<String, Double> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        N = br.readLine();
        map.put("A+", 4.3);
        map.put("A0", 4.0);
        map.put("A-", 3.7);

        map.put("B+", 3.3);
        map.put("B0", 3.0);
        map.put("B-", 2.7);

        map.put("C+", 2.3);
        map.put("C0", 2.0);
        map.put("C-", 1.7);

        map.put("D+", 1.3);
        map.put("D0", 1.0);
        map.put("D-", 0.7);

        map.put("F", 0.0);

        bw.write(String.valueOf(map.get(N)));




        bw.flush();
    }
}
