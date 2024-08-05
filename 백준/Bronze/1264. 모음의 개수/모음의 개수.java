import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String s;
    static int answer;

    public static void main(String[] args) throws IOException {
        while(!(s = br.readLine()).equals("#")){
            answer = 0;

            s = s.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'u'|| s.charAt(i) == 'i') answer++;
            }

            bw.write(answer+"\n");
        }
        bw.flush();
    }
}
