import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int[][] A;
    static int[] P;

    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        A = new int[N][2];
        P = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            A[i][0] = Integer.parseInt(st.nextToken());
            A[i][1] = i;
        }

        Arrays.sort(A, ((o1, o2) -> o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1]));

        for (int i = 0; i < N; i++) {
            P[A[i][1]] = i;
        }

        for (int i = 0; i < N; i++) {
           bw.write(P[i]+" ");
        }


        bw.flush();
    }
}
