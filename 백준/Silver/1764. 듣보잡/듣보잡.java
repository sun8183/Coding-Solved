import java.io.*;
import java.util.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static HashMap<String, Integer> map = new HashMap<>();
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);

        for (int i = 0; i < N; i++) {
            s = br.readLine();
            map.put(s, 1);
        }

        for (int i = 0; i < M; i++) {
            s = br.readLine();

            if(map.get(s) != null) list.add(s);
        }

        list.sort(Comparator.naturalOrder());

        bw.write(list.size()+"\n");

        for (String str : list) {
            bw.write(str + "\n");
        }

        bw.flush();
    }

}
