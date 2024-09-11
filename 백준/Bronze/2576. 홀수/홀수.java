import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int answer = 101;
    static int sum;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 7; i++) {
           int s = Integer.parseInt(br.readLine());
            if(s%2==1) {
                sum+= s;
                answer = Math.min(answer, s);
            }
        }

        if(sum == 0) bw.write("-1");
        else {
            bw.write(sum + "\n");
            bw.write(String.valueOf(answer));
        }
        bw.flush();
    }
}
