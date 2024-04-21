import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int W;
    static int H;
    static int Z = 0;
    static int [] angle = new int[3];

    public static void main(String[] args) throws IOException {
        String s;

        boolean flag = false;
        while(!(s = br.readLine()).equals("0 0 0")){
            flag = false;

            StringTokenizer st = new StringTokenizer(s);
            angle[0] = Integer.parseInt(st.nextToken());
            angle[1] = Integer.parseInt(st.nextToken());
            angle[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(angle);

            if(angle[2]* angle[2] == angle[1] * angle[1] + angle[0] * angle[0]) flag = true;

            if(flag) bw.write("right");
            else bw.write("wrong");

            bw.write("\n");
        }
        bw.flush();
    }
}