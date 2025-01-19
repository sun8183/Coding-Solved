import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static StringTokenizer st;
    static int[] jo = new int[2];
    static int[] beak = new int[2];
    static int T, r1, r2;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            jo[0] = Integer.parseInt(st.nextToken());
            jo[1] = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());

            beak[0] = Integer.parseInt(st.nextToken());
            beak[1] = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());

            if(jo[0] == beak[0] && jo[1] == beak[1] && r1 == r2) {
                bw.write("-1");
            }else{
                int d = (int) Math.pow(jo[0] - beak[0], 2) + (int) Math.pow(jo[1] - beak[1], 2);
                if(d == (int) Math.pow(r1+r2, 2) || d == (int) Math.pow(r1-r2, 2)) bw.write("1");
                else if((int) Math.pow(r1-r2, 2) < d && (int) Math.pow(r1+r2, 2) > d)bw.write("2");
                else bw.write("0");
            }


            bw.write("\n");
        }


        bw.flush();
    }
}
