import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static Map<Integer, String> map = new HashMap<>();
    static int N;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i =0; i <= 30; i++) {
            map.put((int)Math.pow(2,i), "1");
        }

        if(map.get(N) != null) bw.write("1");
        else bw.write("0");

        bw.flush();
    }

}





