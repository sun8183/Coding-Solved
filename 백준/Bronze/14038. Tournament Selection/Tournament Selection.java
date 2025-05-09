import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;
    static int answer, win;
    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 6; i++) {
            s = br.readLine();
            if(s.charAt(0) == 'W') win++;
        }

        if(win == 5 || win == 6) answer = 1;
        else if(win == 4 || win == 3) answer = 2;
        else if(win == 1 || win == 2) answer = 3;

        if(answer == 0) answer = -1;
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}













