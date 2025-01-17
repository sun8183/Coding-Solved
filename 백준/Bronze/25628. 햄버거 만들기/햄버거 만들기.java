import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    static int a, b;
    static int answer;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        while(true){
            if(a - 2 < 0 || b - 1 < 0) break;
            else {
                answer++;
                a -= 2;
                b--;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}







