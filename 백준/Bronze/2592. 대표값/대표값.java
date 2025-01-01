import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int[] number = new int[10];
    static int avg, max, mode;
    static Map<Integer, Integer> map = new HashMap<>();
    
    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 10; i++) {
            number[i] = Integer.parseInt(br.readLine());

            avg += number[i];

            if(map.get(number[i]) != null) map.put(number[i], map.get(number[i])+1);
            else map.put(number[i], 1);
        }

        avg /= 10;


        for (Integer s : map.keySet()) {
            if(max < map.get(s)){
                max = map.get(s);
                mode = s;
            }
        }

        bw.write(avg+"\n");
        bw.write(String.valueOf(mode));
        bw.flush();
    }

}





