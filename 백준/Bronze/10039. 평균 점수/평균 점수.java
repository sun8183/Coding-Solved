import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] N = new int[5];

    public static void main(String[] args) throws IOException {
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int b = Integer.parseInt(br.readLine());
            if(b < 40) b = 40;
            sum+= b;
        }

        bw.write(sum/5+"");
        bw.flush();
    }
}

