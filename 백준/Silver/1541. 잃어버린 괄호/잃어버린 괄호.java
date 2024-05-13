import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int answer;
    static String[] minus;
    static String[] plus;
    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        minus = s.split("-");
        for (int i = 0; i < minus.length; i++) {
            plus = minus[i].split("[+]");       // 정규 표현식 문자 구분
            int tmp = 0;
            for (int j = 0; j < plus.length; j++) {
                tmp += Integer.parseInt(plus[j]);
            }
            if (i == 0) answer = tmp;
            else answer -= tmp;
        }
        
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
