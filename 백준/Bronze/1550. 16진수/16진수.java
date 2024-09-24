import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;
    static int answer;
    static int idx = 1;

    public static void main(String[] args) throws IOException {
        s = br.readLine();

        for (int i = s.length() -1; i >= 0; i--) {
            char ch = s.charAt(i);
            int tmp;
            if(ch - 'A' >= 0){ // 문자일 경우
                tmp = ch - 'A' + 10;
                answer += tmp * idx;
            }else{
                tmp = Integer.parseInt(ch+"");
                answer += tmp * idx;
            }

            idx *= 16;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}