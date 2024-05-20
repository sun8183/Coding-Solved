import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        int i = 2;
        while(N != 1){
            if(N%i == 0){
                N /= i;
                bw.write(i+"\n");
            }else{
                i++;
            }
        }

        bw.flush();
    }
}
