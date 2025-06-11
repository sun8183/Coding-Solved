import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, answer;
    
    public static void main(String[] args) throws IOException {
        while((N = Integer.parseInt(br.readLine())) != 0){
            answer = 0;
            for (int i = 1; i <= N; i++) {
                answer += i;
            }
            bw.write(answer+"\n");
        }
        bw.flush();
    }
}














