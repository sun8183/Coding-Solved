import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static String s;
    static int answer;
    static char[] ch = {'a', 'e', 'i', 'o', 'u'};
    
    public static void main(String[] args) throws IOException {
        s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < ch.length; j++) {
                if(s.charAt(i) == ch[j]) answer++;
            }
        }
        
        bw.write(String.valueOf(answer));
        bw.flush();
    }

}
