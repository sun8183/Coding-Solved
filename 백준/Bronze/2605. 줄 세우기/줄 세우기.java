import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static ArrayList<Integer> list = new ArrayList<>();
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            int s = Integer.parseInt(st.nextToken());
            list.add(i-s-1, i);
        }

        for (int i = 0; i < N; i++) {
            bw.write(list.get(i)+" ");
        }
        bw.flush();
    }

}








