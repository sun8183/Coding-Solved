import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int answer;
    static String s;
    
    public static void main(String[] args) throws IOException {
        
        while((s = br.readLine()) != null){
            answer++;
        }
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}












