import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int answer = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        top(N, 1, 2, 3);

        bw.write(answer+"\n");
        bw.write(sb.toString());
        bw.flush();
    }

    public static void top(int n, int A, int B, int C){
        if(n == 0) return;
        else {
            top(n-1, A, C, B);
            sb
                    .append(A)
                    .append(" ")
                    .append(C)
                    .append("\n");
            top(n-1, B, A, C);
            answer++;
        }
    }
}