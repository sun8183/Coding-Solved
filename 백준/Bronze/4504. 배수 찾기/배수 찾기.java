import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, s;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        while((s = Integer.parseInt(br.readLine())) != 0){
            if(s%N != 0) bw.write(s+" is NOT a multiple of "+N+".");
            else bw.write(s+" is a multiple of "+N+".");

            bw.write("\n");
        }
        bw.flush();
    }

}





