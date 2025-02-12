import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int answer;
    static int num;
    
    public static void main(String[] args) throws IOException {
        while((num = Integer.parseInt(br.readLine())) != -1){
            answer += num;
        }
        
        bw.write(String.valueOf(answer));
        bw.flush();
    }

}








