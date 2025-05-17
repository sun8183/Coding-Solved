import java.io.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int answer;
    
    public static void main(String[] args) throws IOException {
        answer = Integer.parseInt(br.readLine()) * 1000;
        answer += Integer.parseInt(br.readLine()) * 10000;
        
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
