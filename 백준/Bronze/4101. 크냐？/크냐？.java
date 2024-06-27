import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N, M;
    static String answer;
    public static void main(String[] args) throws IOException {
        String s;

        while(true){
            s = br.readLine();
            N = Integer.parseInt(s.split(" ")[0]);
            M = Integer.parseInt(s.split(" ")[1]);

            if(N == 0 && M == 0) break;
            if(N <= M) answer = "No";
            else answer = "Yes";
            bw.write(answer+"\n");
        }
        bw.flush();
    }
}



