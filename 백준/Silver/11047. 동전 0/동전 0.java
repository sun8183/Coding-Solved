import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static int target;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        n = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());

        int[] coin = new int[n];

        for(int i=0; i<n; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        for (int i = n-1; i >= 0; i--) {
            if(target / coin[i] > 0 ){
                answer += target / coin[i];
                target = target - coin[i] * (target / coin[i]);
            }else{
                if(target % coin[i] == 0) {
                    answer += target / coin[i];
                    break;
                }else continue;
            }
        }


        bw.write(String.valueOf(answer));
        bw.flush();
    }
}