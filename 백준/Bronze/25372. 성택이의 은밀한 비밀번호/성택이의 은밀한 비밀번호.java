import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            s = br.readLine();
            
            if(s.length() >= 6 && s.length() <= 9) bw.write("yes");
            else bw.write("no");
            bw.write("\n");
        }

        bw.flush();
    }

}


