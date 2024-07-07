import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N, M;
    static StringTokenizer st;
    static int[][] arr;
    static int[] arr_c;

    static ArrayDeque<Integer> deque = new ArrayDeque<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[2][N];

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(i == 1){
                    if(arr[0][j] == 0){
                        deque.addLast(arr[i][j]);
                    }
                }
            }
        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr_c = new int[M];

        for (int i = 0; i < M; i++) {
            arr_c[i] = Integer.parseInt(st.nextToken());
            deque.addFirst(arr_c[i]);
            sb.append(deque.removeLast()).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
