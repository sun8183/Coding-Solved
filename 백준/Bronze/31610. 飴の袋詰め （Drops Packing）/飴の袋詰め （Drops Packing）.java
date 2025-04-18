import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] num = new int[3];

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        
        bw.write(String.valueOf(num[0] * num[1] + num[2]));
        bw.flush();
    }
}












