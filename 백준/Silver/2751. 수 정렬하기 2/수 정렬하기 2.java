import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            list.add(x);
        }

        Collections.sort(list);

        for (Integer integer : list) {
            bw.write(integer + "\n");
        }

        bw.flush();
    }
}