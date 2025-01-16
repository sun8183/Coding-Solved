import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[] answer = new int[2];
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            answer[0] += i;
            answer[1] += (int) Math.pow(i, 3);
        }

        bw.write(answer[0]+"\n");
        bw.write(answer[0]*answer[0]+"\n");
        bw.write(answer[1]+"\n");

        bw.flush();
    }

}





