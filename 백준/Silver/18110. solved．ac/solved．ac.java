import java.io.*;
import java.util.Arrays;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int[] level;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        level = new int[N];
        int sum = 0;
        int del = Math.round((float) N  / 100 * 15);

        for(int i=0; i<N; i++){
            level[i] = Integer.parseInt(br.readLine());
            sum+= level[i];
        }

        Arrays.sort(level);

        for(int i=0; i<del; i++){
            sum-= level[i];
            sum-= level[level.length-1-i];
        }

        sum = Math.round((float) sum / (N - (2*del)));

        bw.write(String.valueOf(sum));
        bw.flush();
    }
}