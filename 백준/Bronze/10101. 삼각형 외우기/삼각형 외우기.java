import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int A, B, C;

    public static void main(String[] args) throws IOException {
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());

        if(A + B + C == 180){
            if(A == 60 && B == 60 && C == 60) bw.write("Equilateral");
            else if(A == B || A == C || B == C) bw.write("Isosceles");
            else bw.write("Scalene");
        }
        else bw.write("Error");
        bw.flush();
    }
}