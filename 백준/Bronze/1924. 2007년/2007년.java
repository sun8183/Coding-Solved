import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int x, y;
    static String [] answer = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    static int day;
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        day = y;
        while(x != 1){
            x--;
            if(x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) day += 31;
            else if(x == 4 || x == 6 || x == 9 || x == 11) day += 30;
            else day += 28;
        }

        bw.write(answer[day%7]);
        bw.flush();
    }
}
