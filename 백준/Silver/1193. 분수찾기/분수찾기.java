import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        int x = 1;
        int y = 1;

        int d = 1;
        boolean flag = false;

        for (int i = 2; i <= N; i++) {
            if(!flag){  // 홀수번째 방향전환
                if(y == d){
                    d++;
                    y = d;
                    x = 1;
                    flag = true;
                }else{
                    y++;
                    x--;
                }
            }else {
                if(x == d){
                    d++;
                    x = d;
                    y = 1;
                    flag = false;
                }else{
                    y--;
                    x++;
                }
            }
        }

        bw.write(x+"/"+y);
        bw.flush();
    }
}
