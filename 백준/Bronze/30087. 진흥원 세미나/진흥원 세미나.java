import java.io.*;
import java.util.HashMap;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int T;
    static HashMap<String, String> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        map.put("Algorithm", "204");
        map.put("DataAnalysis", "207");
        map.put("ArtificialIntelligence", "302");
        map.put("CyberSecurity", "B101");
        map.put("Network", "303");
        map.put("Startup", "501");
        map.put("TestStrategy", "105");

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            
            bw.write(map.get(s)+"\n");
        }
        


        bw.flush();
    }
}












