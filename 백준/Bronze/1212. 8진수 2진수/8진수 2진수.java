import java.io.*;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;
    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) throws IOException {
        s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            int c = Integer.parseInt(s.charAt(i)+"");
            StringBuilder sb = new StringBuilder(Integer.toBinaryString(c));
            while (sb.length() < 3){
                sb.insert(0, "0");
            }
            answer.append(sb);
        }

        if("000".contentEquals(answer)) bw.write("0");
        else {
            while(true){
                if(answer.charAt(0) == '0') answer.deleteCharAt(0);
                else break;
            }
            bw.write(answer.toString());
        }
        bw.flush();
    }
}
