import java.io.*;
import java.util.HashSet;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static HashSet<String> set = new HashSet<>();
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if("ENTER".equals(s)){
                answer += set.size();
                set.clear();
            }else{
                set.add(s);
            }
        }

        answer += set.size();

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
