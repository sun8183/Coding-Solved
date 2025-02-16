import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String mbti, s;
    static int T, answer;
    
    public static void main(String[] args) throws IOException {
        mbti = br.readLine();
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            s = br.readLine();
            
            if(mbti.equals(s)) answer++;
        }
        
        bw.write(String.valueOf(answer));
        bw.flush();
    }

}









