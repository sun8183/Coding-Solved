import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int start;
    static int end;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        start = Integer.parseInt(s.split(" ")[0]);
        end = Integer.parseInt(s.split(" ")[1]);

        for(int i=start; i<=end; i++){
            if(isPrime(i)) bw.write(i+"\n");
        }
        bw.flush();
    }

    public static boolean isPrime(int num){

        if(num == 1) return false;
        else if(num == 2) return true;
        else {
            for(int i=2; i<Math.sqrt(num)+1; i++){
                if(num%i == 0) return false;
            }
        }

        return true;
    }
}