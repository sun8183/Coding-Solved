import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;

    public static void main(String[] args) throws IOException {

        while((s = br.readLine()) != null){
            int a = 0, b = 0, c = 0, d = 0;
            for (int i = 0; i < s.length(); i++) {

                if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') a++;
                else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') b++;
                else if(s.charAt(i) == ' ') c++;
                else d++;
            }

            bw.write(a+" "+b+" "+d+" "+c+"\n");
            bw.flush();
        }

        bw.flush();
    }

}
