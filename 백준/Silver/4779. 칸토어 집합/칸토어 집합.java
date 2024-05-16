import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;

    public static void main(String[] args) throws IOException {
        String s = "";
        while((s = br.readLine()) != null){
            N = Integer.parseInt(s);
            kanto(N);
            bw.write("\n");
            bw.flush();
        }
    }

    public static void kanto(int n) throws IOException {
        if(n == 0) {
            bw.write("-");
        }else {
            kanto(n-1);
            for (int i = 0; i < Math.pow(3, n-1); i++) {
                    bw.write(" ");
            }
            kanto(n-1);
        }
    }
}
