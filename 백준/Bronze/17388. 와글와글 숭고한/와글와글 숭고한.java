import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int S, K, H;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        if(S+K+H >= 100) bw.write("OK");
        else {
            if(S < K && S < H) bw.write("Soongsil");
            else if(K < S && K < H) bw.write("Korea");
            else bw.write("Hanyang");
        }
        bw.flush();
    }

}





