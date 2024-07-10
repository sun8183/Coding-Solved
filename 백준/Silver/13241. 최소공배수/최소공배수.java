import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static long A, B;
    static long max, min;
    static long answer = 1;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        A = Integer.parseInt(s.split(" ")[0]);
        B = Integer.parseInt(s.split(" ")[1]);

        max = Math.max(A, B);
        min = Math.min(A, B);

        if(max % min != 0) {
            long idx = 2;
            while (idx < min) {
                if (min % idx == 0 && max % idx == 0) {
                    answer *= idx;
                    min /= idx;
                    max /= idx;
                } else idx++;
            }
            bw.write(String.valueOf(answer*min*max));
        }else{
            bw.write(String.valueOf(max));
        }

        bw.flush();
    }
}



