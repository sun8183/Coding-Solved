import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int hour, min, sec, D;
    static String s;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        s = br.readLine();
        st = new StringTokenizer(s);

        hour = Integer.parseInt(st.nextToken());
        min = Integer.parseInt(st.nextToken());
        sec = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(br.readLine());

        sec += D;
        if(sec >= 60){
            min += sec / 60;
            sec = sec % 60;
        }

        if(min >= 60){
            hour += min / 60;
            min = min % 60;
        }

        if(hour >= 24){
            hour = hour % 24;
        }

        bw.write(hour + " " + min + " " + sec);
        bw.flush();
    }
}
