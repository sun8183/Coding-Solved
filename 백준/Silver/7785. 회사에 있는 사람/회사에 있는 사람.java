import java.io.*;
import java.util.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static HashMap<String, String> log = new HashMap<>();
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            log.put(st.nextToken(), st.nextToken());
        }

        for (String s : log.keySet()) {
            if(log.get(s).equals("enter")) {
                list.add(s);
            }
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i)+"\n");
        }
        bw.flush();
    }
}

