import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int A, B, C;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        A = Integer.parseInt(s.split(" ")[0]);
        B = Integer.parseInt(s.split(" ")[1]);
        C = Integer.parseInt(s.split(" ")[2]);

        bw.write(div(B)+"");
        bw.flush();
    }

    public static long div(long num){
        if(num == 1) return A%C;
        else{
            long k = div(num/2)%C;

            if(num%2==0) return k*k%C;
            else return k*k%C*A%C;
        }
    }
}
