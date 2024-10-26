import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] num = new int[5];

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        while(num[1] > 0 || num[2] > 0){
            num[0]--;
            num[1] = num[1] - num[3];
            num[2] = num[2] - num[4];
        }

        bw.write(String.valueOf(num[0]));
        bw.flush();
    }

}