import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static ArrayList<Integer>[] Tree;
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        Tree = new ArrayList[N+1];

        for (int i = 1; i <= N; i++) {
            Tree[i] = new ArrayList<>();
        }

        parent = new int[N+1];
        visited = new boolean[N+1];

        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            Tree[a].add(b);
            Tree[b].add(a);
        }

        dfs(1);

        for (int i = 2; i <= N; i++) {
            bw.write(parent[i]+"\n");
        }

        bw.flush();
    }

    public static void dfs(int root){
        visited[root] = true;
        for (int i : Tree[root]) {
            if(!visited[i]){
                parent[i] = root;
                dfs(i);
            }
        }
    }
}