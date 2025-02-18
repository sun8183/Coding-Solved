import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] number = {0, 1, 2, 3, 4, 5, 4, 3, 2};
    static int[] finger = {2, 1, 2, 3, 4, 5, 4, 3, 2};

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(finger[number[N%8]]));
        bw.flush();
    }

}









