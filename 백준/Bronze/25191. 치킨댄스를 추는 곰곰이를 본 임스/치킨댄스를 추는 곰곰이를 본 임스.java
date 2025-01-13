import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int chicken, cola, bear, answer;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        chicken = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        cola = Integer.parseInt(st.nextToken());
        bear = Integer.parseInt(st.nextToken());


        answer += cola/2 + bear;
        if(answer > chicken) answer = chicken;


        bw.write(String.valueOf(answer));
        bw.flush();
    }

}





