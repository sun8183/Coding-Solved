import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer st;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            double answer = Double.parseDouble(st.nextToken());

            while(st.hasMoreTokens()){
                String s = st.nextToken();

                if(s.equals("@")) answer *= 3;
                else if(s.equals("%")) answer += 5;
                else answer -= 7;
            }

            System.out.printf("%.2f\n", answer);
        }

        bw.flush();
    }

}

