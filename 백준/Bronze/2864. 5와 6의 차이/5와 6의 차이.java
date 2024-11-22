import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());


        String a = st.nextToken();
        String b = st.nextToken();

        int min = Integer.parseInt(a.replace("6", "5")) +Integer.parseInt(b.replace("6", "5"));
        int max = Integer.parseInt(a.replace("5", "6")) +Integer.parseInt(b.replace("5", "6"));

        bw.write(min + " "+ max);
        bw.flush();
    }

}

