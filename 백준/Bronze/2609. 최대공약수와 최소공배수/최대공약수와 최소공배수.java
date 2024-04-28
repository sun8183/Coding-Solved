import java.io.*;
import java.util.PriorityQueue;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static int k;
    static PriorityQueue<Integer> queue = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        n = Integer.parseInt(s.split(" ")[0]);
        k = Integer.parseInt(s.split(" ")[1]);

        int idx = 2;

        while(disJoint(n, k)){
            if(n % idx == 0 && k % idx == 0){
                n /= idx;
                k /= idx;
                queue.offer(idx);
                idx = 2;
            }else idx++;
        }

        int gcd = 1;    // 최대 공약수
        int lcm = 0;    // 최소 공배수

        while(!queue.isEmpty()){
            gcd *= queue.poll();
        }

        lcm = gcd * n * k;

        bw.write(gcd+"\n");
        bw.write(lcm+"");

        bw.flush();
    }

    public static boolean disJoint(int a, int b){
        boolean flag = false;

        int idx = 2;
        while(true){

            if(n % idx == 0 && k % idx == 0){
                flag = true;
                break;
            }else{
                idx++;
            }

            if(idx > n || idx > k) break;
        }

        return flag;
    }
}
