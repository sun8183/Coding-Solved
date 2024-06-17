import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int people;
    static int[] shirts = new int[6];
    static int T, P;

    static int t_answer;
    static int[] p_answer = new int[2];

    public static void main(String[] args) throws IOException {
        people = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        for (int i = 0; i < 6; i++) {
            shirts[i] = Integer.parseInt(st.nextToken());
        }

        s = br.readLine();
        st = new StringTokenizer(s);
        T = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 6; i++) {
            t_answer += Math.ceil((double)shirts[i]/T);
        }

        p_answer[0] = people/P;
        p_answer[1] = people%P;

        bw.write(t_answer+"\n");
        bw.write(p_answer[0]+" "+p_answer[1]);
        bw.flush();
    }
}