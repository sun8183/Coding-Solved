import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringTokenizer st;
    static int a, b, c;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        if(b < Math.max(a,c)) bw.write("Bus");
        else if(b == Math.max(a,c)) bw.write("Anything");
        else bw.write("Subway");
        bw.flush();
    }
}
