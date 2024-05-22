import java.io.*;
import java.util.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static PriorityQueue<Integer> queuePlus;
    static PriorityQueue<Integer> queueMinus;
    static HashMap<Integer, Integer> map;

    static int T;
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            queuePlus = new PriorityQueue<>(Collections.reverseOrder());
            queueMinus = new PriorityQueue<>();
            map = new HashMap<>();

            int N = Integer.parseInt(br.readLine());

            int del = 0;
            int ins = 0;

            for (int j = 0; j < N; j++) {
                String s = br.readLine();
                StringTokenizer st = new StringTokenizer(s);

                String ch = st.nextToken();
                int nums = Integer.parseInt(st.nextToken());

                if("D".equals(ch)){
                    if(del < ins) {
                        if(nums == -1) {
                            while(map.get(queueMinus.peek()) < 1){
                                queueMinus.poll();
                            }
                            map.put(queueMinus.peek(), map.get(queueMinus.peek())-1);
                            queueMinus.poll();
                        } else {
                            while(map.get(queuePlus.peek()) < 1){
                                queuePlus.poll();
                            }
                            map.put(queuePlus.peek(), map.get(queuePlus.peek())-1);
                            queuePlus.poll();
                        }
                        del++;
                    }
                }else{
                    ins++;
                    queuePlus.offer(nums);
                    queueMinus.offer(nums);

                    if(map.get(nums) == null || map.get(nums) == 0) map.put(nums, 1);
                    else map.put(nums, map.get(nums)+1);
                }
            }

            if(del == ins) bw.write("EMPTY\n");
            else{
                StringBuilder sb = new StringBuilder();
                while(map.get(queueMinus.peek()) < 1){
                    queueMinus.poll();
                }
                while(map.get(queuePlus.peek()) < 1){
                    queuePlus.poll();
                }
                sb.append(queuePlus.peek())
                        .append(" ")
                        .append(queueMinus.peek())
                        .append("\n");

                bw.write(sb.toString());
            }
        }


        bw.flush();
    }
}

