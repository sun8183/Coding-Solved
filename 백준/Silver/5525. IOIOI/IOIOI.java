import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static String target;
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder("I");
        target = br.readLine();

        for (int i = 0; i < N; i++) {
            sb.append("OI");
        }

        for (int i = 0; i <= target.length() - sb.toString().length(); i++) {
            String s = target.substring(i, i+sb.toString().length());
            if(s.equals(sb.toString())) answer++;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
