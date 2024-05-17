import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static String target;
    static String str;
    static int answer;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        target = br.readLine();

        int cnt = 0;
        for (int i = 1; i < M-1;) {
            if(target.charAt(i) == 'O' && target.charAt(i+1) == 'I'){
                cnt++;
                if(cnt == N){
                    if(target.charAt(i-(cnt*2-1)) == 'I') answer++;
                    cnt--;
                }
                i+=2;
            }else{
                cnt = 0;
                i++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
