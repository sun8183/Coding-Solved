import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static StringBuilder sb;
    static int sum;
    public static void main(String[] args) throws IOException {
        while(true){
            N = Integer.parseInt(br.readLine());

            if(N == -1) break;
            else{
                sb = new StringBuilder(N+" = ");
                sum = 0;

                for (int i = 1; i <= N/2; i++) {
                    if(N%i == 0) {
                        sb.append(i);
                        sum += i;

                        if(sum < N) sb.append(" + ");
                    }

                    if(sum > N){
                        break;
                    }
                }

                if(sum != N) sb = new StringBuilder(String.valueOf(N)).append(" is NOT perfect.");
                sb.append("\n");
                bw.write(sb.toString());
            }
        }

        bw.flush();
    }
}

