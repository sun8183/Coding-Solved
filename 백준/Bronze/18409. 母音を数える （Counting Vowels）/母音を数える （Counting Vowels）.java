import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N, answer;
    static String s;
    static char[] str = {'a', 'i', 'u', 'e', 'o'};
    
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        s = br.readLine();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < str.length; j++) {
                if(str[j] == s.charAt(i)) {
                    answer++;
                    break;
                }
            }
        }
        
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}













