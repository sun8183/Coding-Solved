import java.io.*;
import java.util.Arrays;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] N;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(N);

        System.out.println(N[1]);
    }
}