import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static char[]A;
    static char[]B;
    static int answer;

    static String s;

    public static void main(String[] args) throws IOException {
        s = br.readLine();
        A = s.toCharArray();
        s = br.readLine();
        B = s.toCharArray();

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if(A[i] == B[j]) {
                   A[i] = '0';
                   B[j] = '0';
                }
            }
        }

        for (char c : A) {
            if (c != '0') answer++;
        }

        for (char c : B) {
            if (c != '0') answer++;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}








