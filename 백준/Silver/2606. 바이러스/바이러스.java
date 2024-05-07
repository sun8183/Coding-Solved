import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int V, E;
    static int [][] graph;
    static boolean[] visited;

    static ArrayDeque<Integer> stack = new ArrayDeque<>();
    static ArrayList<Integer> track = new ArrayList<>();
    static int current;

    public static void main(String[] args) throws IOException {
        V = Integer.parseInt(br.readLine());
        E = Integer.parseInt(br.readLine());

        // 인접 행렬 2차원 그래프
        graph = new int[V][V];
        visited = new boolean[V];

        for(int i=0; i<E; i++){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph[start-1][end-1] = 1;
            graph[end-1][start-1] = 1;
        }

        // 초기노드 추가
        stack.addLast(1);

        while(!stack.isEmpty()){

            current = stack.removeLast();

            if(!visited[current -1]){
                visited[current -1] = true;
                track.add(current);
            }

            for(int i = 0; i < V; i++){
                if(!visited[i] && graph[current -1][i] == 1){
                    stack.addLast(i+1);
                }
            }

        }

        System.out.println(track.size() -1); // 자기자신 제외 

    }
}