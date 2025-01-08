import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static String[] str;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            str = br.readLine().split(" ");

            bw.write("Case #"+(i+1)+": ");
            for (int j = str.length-1; j >= 0; j--) {
                bw.write(str[j]);
                bw.write(" ");
            }

            bw.write("\n");
        }
        bw.flush();
    }

}





