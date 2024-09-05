import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int A;
    static int B;
    static int C;

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        if(N >= 300){
            A = N / 300;
            N -= A * 300;
        }

        if(N >= 60){
            B = N / 60;
            N -= B * 60;
        }

        if(N >= 10){
            C = N / 10;
            N -= C * 10;
        }

        if(N != 0) bw.write("-1");
        else bw.write(A+" "+B+" "+C);
        bw.flush();
    }
}
