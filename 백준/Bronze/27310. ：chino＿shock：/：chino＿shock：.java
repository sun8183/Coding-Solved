import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;
    static int answer; 
    
    public static void main(String[] args) throws IOException {
        s = br.readLine();
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '_') answer +=5;
            else if(s.charAt(i) == ':') answer++;
        }
        
        bw.write(String.valueOf(answer+s.length()));
        bw.flush();
    }
}












