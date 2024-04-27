import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        String s = "";
        N = Integer.parseInt(br.readLine());

        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        for(int i=0; i<N; i++){
            int k = Integer.parseInt(st.nextToken());

            if(map.get(k) != null) map.put(k, map.get(k)+1);
            else map.put(k, 1);
        }

        N = Integer.parseInt(br.readLine());
        s = br.readLine();
        st = new StringTokenizer(s);

        for(int i=0; i<N; i++){
            int k = Integer.parseInt(st.nextToken());

            bw.write(map.get(k) != null ? map.get(k)+" " : "0 ");
        }


        bw.flush();
    }
}