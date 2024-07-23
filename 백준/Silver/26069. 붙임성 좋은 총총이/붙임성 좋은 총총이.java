import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static int N;
    static HashSet<String> set = new HashSet<>();
    static HashSet<String> dance = new HashSet<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        set.add("ChongChong");
        dance.add("ChongChong");

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            String s1 = st.nextToken();
            String s2 = st.nextToken();

            if(dance.contains(s1)){
                set.add(s2);
                dance.add(s2);
            }

            if(dance.contains(s2)){
                set.add(s1);
                dance.add(s1);
            }
        }

        bw.write(set.size()+"");
        bw.flush();
    }
}
