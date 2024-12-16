import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int T;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            int idx = 0;

            while(num > 0){
                if(num%2!=0) bw.write(idx+" ");
                num /= 2;
                idx++;
            }
            
            bw.write("\n");
        }
        bw.flush();
    }

}




