import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String s;
    static int[] cnt = new int[26];
    public static void main(String[] args) throws IOException {
        s = br.readLine();


        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i)-(int)'a'] += 1;
        }


        for (int i = 0; i < cnt.length; i++) {
            bw.write(cnt[i]+" ");
        }
        bw.flush();
    }
}
