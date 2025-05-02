import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int []b = new int[4];

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 4; i++) {
            int a = Integer.parseInt(br.readLine());
            b[i] = a;
        }

        if(b[0] == 8 || b[0] == 9) {
            if(b[3] == 8 || b[3] == 9) {
                if(b[1] == b[2]) bw.write("ignore");
                else bw.write("answer");
            }
            else bw.write("answer");
        } else bw.write("answer");

        bw.flush();
    }
}













