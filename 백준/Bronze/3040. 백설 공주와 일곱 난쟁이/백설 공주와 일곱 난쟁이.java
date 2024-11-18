import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] arr = new int[9];
    static int sum;
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < 9; i++) {
            sum += arr[i];
        }

        sum -= 100;

        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 9; j++) {
                if(arr[i] + arr[j] == sum){
                    arr[i] = 0;
                    arr[j] = 0;

                    i = 10;
                    break;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if(arr[i] != 0) bw.write(arr[i]+"\n");
        }
        bw.flush();
    }

}
