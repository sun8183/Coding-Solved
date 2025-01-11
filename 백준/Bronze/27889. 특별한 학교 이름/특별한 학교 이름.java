import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static String s;
    static Map<String, String> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        s = br.readLine();

        map.put("NLCS", "North London Collegiate School");
        map.put("BHA", "Branksome Hall Asia");
        map.put("KIS", "Korea International School");
        map.put("SJA", "St. Johnsbury Academy");
        
        bw.write(map.get(s));
        bw.flush();
    }
}
