import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int []arr = new int[6];
    static int min = 100;
    static int answer;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            min = Math.min(min, arr[i]);
            answer += arr[i];
            if(i == 3){
                answer -= min;
                min = 100;
            }
        }


        bw.write(String.valueOf(answer-min));
        bw.flush();
    }

}




