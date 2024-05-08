import java.io.*;
import java.util.ArrayDeque;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    
    static int[][] matrix;
    static boolean[] visited;
    static int answer;
    static ArrayDeque<Integer> stack = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        M = Integer.parseInt(s.split(" ")[1]);
        
        matrix = new int[N][N];
        visited = new boolean[N];

        for (int i = 0; i < M; i++) {
            s = br.readLine();
            int x = Integer.parseInt(s.split(" ")[0]);
            int y = Integer.parseInt(s.split(" ")[1]);

            matrix[x-1][y-1] = 1;
            matrix[y-1][x-1] = 1;
        }

        int root = 0;

        while(root > -1){
            answer += dfs(root);
            root = visited();
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

    public static int dfs(int root) {
        visited[root] = true;
        stack.addLast(root);

        while(!stack.isEmpty()){
            for (int i = 0; i < N; i++) {
                if(matrix[root][i] == 1 && !visited[i]) {
                    stack.addLast(i);
                    visited[i] = true;
                    matrix[root][i] = 0;
                    matrix[i][root] = 0;
                }
            }
            root = stack.removeLast();
        }
        
        return 1;
    }

    public static int visited(){

        for (int i = 0; i < N; i++) {
            if(!visited[i]) return i;
        }

        return -1;
    }

}
