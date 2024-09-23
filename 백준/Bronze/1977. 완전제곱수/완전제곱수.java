import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, M;
    static int sum, min;
    
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 100; i++) {
            if(N <= i * i && M >= i * i) {
                sum += i * i;
                min = min == 0 ? i * i : min;
            }
        }

        if(sum == 0) sum = -1;
        bw.write(sum+"\n");
        if(min != 0) bw.write(String.valueOf(min));
        bw.flush();
    }

}