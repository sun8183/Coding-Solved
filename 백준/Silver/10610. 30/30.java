import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String N;
    static String[] arr;
    static String answer = "";
    static int sum;

    public static void main(String[] args) throws IOException {
        N = br.readLine();
        arr = new String[N.length()];

        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i)+"";
        }

        Arrays.sort(arr, Collections.reverseOrder());

        if(!arr[N.length()-1].equals("0") || (N.length() < 3 && Integer.parseInt(N) < 30)) answer = "-1";
        else {
            for (int i = 0; i < arr.length -1; i++) {
                sum += Integer.parseInt(arr[i]);
                answer+=arr[i];
            }

            if(sum%3==0) answer += "0";
            else answer = "-1";
        }


        bw.write(answer);
        bw.flush();
    }

}