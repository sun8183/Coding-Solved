import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    static int max, mel;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        max += 3 * Integer.parseInt(st.nextToken()) + 20 * Integer.parseInt(st.nextToken()) + 120 * Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        mel += 3 * Integer.parseInt(st.nextToken()) + 20 * Integer.parseInt(st.nextToken()) + 120 * Integer.parseInt(st.nextToken());

        if(max > mel) bw.write("Max");
        else if(max < mel) bw.write("Mel");
        else bw.write("Draw");

        bw.flush();
    }
}













