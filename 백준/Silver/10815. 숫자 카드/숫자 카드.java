import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static HashMap<String, String> card = new HashMap<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        for (int i = 0; i < N; i++) {
            card.put(st.nextToken(), "1");
        }

        M = Integer.parseInt(br.readLine());
        s = br.readLine();
        st = new StringTokenizer(s);

        for (int i = 0; i < M; i++) {
            String t = st.nextToken();
            if(card.get(t) != null) bw.write(card.get(t));
            else bw.write("0");
            bw.write(" ");
        }

        bw.flush();
    }
}