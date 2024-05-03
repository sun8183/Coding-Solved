import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int K;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 0;

        for (int i=N; i<=K; i++) {
            if(isPrime(i)){
                if(min == 0) min = i;
                sum+= i;
            }
        }

        if(min == 0) bw.write("-1");
        else {
            bw.write(sum+"\n");
            bw.write(min+"");
        }
        bw.flush();
    }

    public static boolean isPrime(int n){

        if(n == 1) return false;
        else if(n == 2) return true;

        for(int i=2; i<Math.sqrt(n)+1; i++){
            if(n%i == 0) return false;
        }

        return true;
    }
}
