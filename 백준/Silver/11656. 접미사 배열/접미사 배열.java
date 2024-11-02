import java.io.*;
import java.util.Arrays;

public class Main {

    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;
    static String[] arr;

    public static void main(String[] args) throws IOException {
        s = br.readLine();
        arr = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.substring(i);
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i]+"\n");
        }
        bw.flush();
    }
}
