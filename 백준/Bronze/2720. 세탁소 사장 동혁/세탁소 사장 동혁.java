import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static int q;
    static int d;
    static int n;
    static int p;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int nums = Integer.parseInt(br.readLine());

            q = nums / 25;
            d = (nums - q*25)/ 10;
            n = (nums - q*25 - d*10) / 5;
            p = (nums - q*25 - d*10 - n*5);

            bw.write(q+" "+d+" "+n+" "+p+"\n");
        }
        bw.flush();
    }
}

