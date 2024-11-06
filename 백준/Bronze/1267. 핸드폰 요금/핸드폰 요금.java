import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int Y, M;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            Y += num / 30 * 10 + 10;
            M += num / 60 * 15 + 15;
        }

        if(Y > M) bw.write("M "+M);
        else if(Y < M) bw.write("Y "+Y);
        else bw.write("Y M "+Y);

        bw.flush();
    }

}
