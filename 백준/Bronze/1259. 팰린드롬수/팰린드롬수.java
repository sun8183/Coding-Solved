import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n;

    public static void main(String[] args) throws IOException {
        String s = "";
        boolean flag = false;
        while(!(s = br.readLine()).equals("0")){
            n = s.length();
            flag = false;

            for (int i = 0; i < n/2; i++) {
                if(s.charAt(i) == s.charAt(n-i-1)) continue;
                else {
                    flag = true;
                    bw.write("no\n");
                    break;
                }
            }

            if(!flag) bw.write("yes\n");
        }
        bw.flush();
    }
}