import java.io.*;
import java.util.Arrays;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] N = new int[9];
    static int sum = 0;
    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 9; i++) {
            N[i] = Integer.parseInt(br.readLine());
            sum += N[i];
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if(sum - N[i] - N[j] == 100) {
                    N[i] = N[j] = 0;
                    i = 10;
                    break;
                }
            }
        }

        Arrays.sort(N);

        for (int i = 2; i < 9; i++) {
            bw.write(N[i]+"\n");
        }

        bw.flush();
    }
}
