import java.io.*;
import java.util.ArrayDeque;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int K;

    static ArrayDeque<Integer> queue = new ArrayDeque<>();
    static int[] visited = new int[100_001];

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        N = Integer.parseInt(s.split(" ")[0]);
        K = Integer.parseInt(s.split(" ")[1]);

        queue.add(N);

        while(!queue.isEmpty()){
            int root = queue.removeFirst();

            if(root == K) break;
            else {
                for (int i = 0; i < 3; i++) {
                    int x;

                    if(i==0) x = root-1;
                    else if(i==1) x = root+1;
                    else x = root*2;

                    if(x < visited.length && x >= 0 && visited[x] == 0) {
                        visited[x] = visited[root]+1;
                        queue.add(x);
                    }
                }
            }
        }

        bw.write(String.valueOf(visited[K]));
        bw.flush();
    }

}
