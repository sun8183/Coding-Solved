import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static String s;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            s = br.readLine();

            bw.write((s.charAt(0)+"").toUpperCase()+s.substring(1)+"\n");
        }
        bw.flush();
    }

}





