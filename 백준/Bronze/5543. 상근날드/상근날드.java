import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N = 5;
    
    static int answer, answer2;
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < N; i++) {
            if(i == 0) answer = Integer.parseInt(br.readLine());
            else if(i < 3){
                int temp = Integer.parseInt(br.readLine());
                if(answer > temp){
                    answer = temp;
                }
            }else{
                int temp = Integer.parseInt(br.readLine());
                
                if(answer2 == 0) answer2 = temp;
                else{
                    if(answer2 > temp) answer2 = temp;
                }
            }
        }

        bw.write(String.valueOf(answer + answer2 - 50));
        bw.flush();
    }
}
