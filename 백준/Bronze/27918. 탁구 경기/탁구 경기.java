import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int x, y;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if("D".equals(s)) x++;
            else y++;

            if(Math.abs(x - y) == 2) break;
        }

        bw.write(x+":"+y);
        bw.flush();
    }
}












