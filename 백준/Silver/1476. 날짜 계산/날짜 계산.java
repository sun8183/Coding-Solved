import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] num = new int[3];
    static int[] answer = new int[3];
    static int sum = 1;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < 3; i++) {
            num[i] = 1;
            answer[i] = Integer.parseInt(st.nextToken());
        }

        while(num[0] != answer[0] || num[1] != answer[1] || num[2] != answer[2]){
            num[0]++;
            num[0] = num[0] == 16 ? 1 : num[0];
            num[1]++;
            num[1] = num[1] == 29 ? 1 : num[1];
            num[2]++;
            num[2] = num[2] == 20 ? 1 : num[2];

            sum++;
        }

        bw.write(sum + "\n");
        bw.flush();
    }
}
