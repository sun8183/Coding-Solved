import java.io.*;
import java.util.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static int N;
    static int M;

    static ArrayDeque<Print> queue;
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();

            N = Integer.parseInt(s.split(" ")[0]);
            M = Integer.parseInt(s.split(" ")[1]);
            String k = br.readLine();
            StringTokenizer st = new StringTokenizer(k);

            queue = new ArrayDeque<>();
            list = new ArrayList<>();

            for (int j = 0; j < N; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                Print p = new Print(j, tmp);
                queue.addLast(p);
                list.add(tmp);
            }

            list.sort(Collections.reverseOrder());

            int order = 0;
            while(!queue.isEmpty()){
                if(!list.get(order).equals(queue.peekFirst().number)){   // 우선순위에 밀리면 뒤로 이동
                    queue.addLast(queue.removeFirst());
                }else{
                    order++;
                    if(queue.peekFirst().order == M){    // 순서를 알아야할 대상이라면
                        bw.write(order+"\n");
                        break;
                    }else{
                        queue.removeFirst();
                    }
                }
            }
        }


        bw.flush();
    }

    static class Print{
        int order;
        int number;

        Print(int order, int number){
            this.order = order;
            this.number = number;
        }
    }
}