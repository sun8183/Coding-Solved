import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static int answer;

    public static void main(String[] args) throws IOException {
        while((N = Integer.parseInt(br.readLine())) != 0 ){
            String s = String.valueOf(N);
            answer = s.length()+1;

            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') answer += 4;
                else if(s.charAt(i) == '1') answer += 2;
                else answer += 3;
            }

            bw.write(answer+"\n");
        }

        bw.flush();
    }

}









