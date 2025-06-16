import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T, odd, even;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            long s = Long.parseLong(st.nextToken());

            if(s%2 != 0) odd++;
            else even++;
        }

        if(odd >= even) bw.write("Sad");
        else bw.write("Happy");
        bw.flush();
    }
}
