import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int r;
    static int c;
    static int answer;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        r = Integer.parseInt(s.split(" ")[1]);
        c = Integer.parseInt(s.split(" ")[2]);

        answer = Z(N, r, c);
        bw.write(String.valueOf(answer));
        bw.flush();
    }

    public static int Z(int N, int r, int c){

        if(N == 0) return 0;

        return 2*(r%2) + (c%2) + 4*Z(N-1, r/2, c/2);
    }

}
