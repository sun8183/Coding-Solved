import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] arr = new int[10];
    static int[] cache = new int[10];
    static int answer;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(i == 0) cache[i] = arr[i];
            else cache[i] = cache[i-1] + arr[i];
        }

        for (int i = 0; i < 10; i++) {
            if(cache[i] == 100) {
                answer = cache[i];
                break;
            }
            else if(cache[i] > 100){
                if(Math.abs(100-cache[i]) > Math.abs(100-cache[i-1])) answer = cache[i-1];
                else if(Math.abs(100-cache[i]) <= Math.abs(100-cache[i-1])) answer = cache[i];

                break;
            }
        }

        if(answer == 0) answer = cache[9];

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}




