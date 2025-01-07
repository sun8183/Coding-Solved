import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if(Integer.parseInt(s.charAt(s.length()-1)+"") % 2 == 0) bw.write("even");
            else bw.write("odd");

            bw.write("\n");
        }

        bw.flush();
    }

}





