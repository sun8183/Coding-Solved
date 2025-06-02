import java.io.*;

public class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    /* https://www.acmicpc.net/problem/33161 */

    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(N/5));

        bw.flush();

    }

}

