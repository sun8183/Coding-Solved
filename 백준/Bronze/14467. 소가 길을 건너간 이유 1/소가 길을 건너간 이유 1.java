import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static StringTokenizer st;
    static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    static int answer;
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int cow = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken());

            if(map.get(cow) == null){
                map.put(cow, location);
            }else {
                if(map.get(cow) != location){
                    answer++;
                    map.put(cow, location);
                }
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
