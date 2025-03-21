import java.io.*;
import java.util.HashMap;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, sum;
    static HashMap<String, String> map;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < 26; i++) {
            sum += 65+i;
        }

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            int answer = sum;
            map = new HashMap();
            for (int j = 0; j < s.length(); j++) {

                if(map.get(s.charAt(j)+"") == null) {
                    answer -= s.charAt(j);
                    map.put(s.charAt(j)+"", "");
                }
            }

            bw.write(answer+"\n");
        }


        bw.flush();
    }
}










