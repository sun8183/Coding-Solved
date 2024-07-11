import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int []A = new int[3];
    static int []B = new int[3];

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 2; i++) {
            String s = br.readLine();
            A[i] = Integer.parseInt(s.split(" ")[0]);
            B[i] = Integer.parseInt(s.split(" ")[1]);
        }

        A[2] = A[0] * B[1] + A[1] * B[0];
        B[2] = B[0] * B[1];
        int min = Math.min(A[2], B[2]);
        int idx = 2;

        while(idx <= min){
            if(A[2]%idx == 0 && B[2]%idx == 0){
                A[2] /= idx;
                B[2] /= idx;
            }else idx++;
        }

        bw.write(A[2]+" "+B[2]);
        bw.flush();
    }
}



