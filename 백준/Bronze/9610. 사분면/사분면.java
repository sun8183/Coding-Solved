import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int T, X, Y;
    static int []Q = new int[5];
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());

            if(X > 0 && Y > 0) Q[0]++;
            else if(X < 0 && Y > 0) Q[1]++;
            else if(X < 0 && Y < 0) Q[2]++;
            else if(X > 0 && Y < 0) Q[3]++;
            else Q[4] ++;
        }

        for (int i = 0; i < 5; i++) {
            if(i != 4) bw.write("Q"+(i+1)+": " + Q[i]);
            else bw.write("AXIS: "+Q[i]);

            bw.write("\n");
        }
        bw.flush();
    }

}







