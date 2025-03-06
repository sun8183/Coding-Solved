import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;

    public static void main(String[] args) throws IOException {
        int idx = 1;
        while(!"0".equals(s = br.readLine())){
            bw.write("Case "+idx+": Sorting... done!\n");
            idx++;
        }

        bw.flush();
    }

}









