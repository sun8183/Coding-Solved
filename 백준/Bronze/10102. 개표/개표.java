import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;
    static int N;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        s = br.readLine();

        s = s.replace("A","");

        if(s.length() > N-s.length()) bw.write("B");
        else if(s.length() == N-s.length()) bw.write("Tie");
        else bw.write("A");

        bw.flush();
    }

}




