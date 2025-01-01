import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int student, max;
    static Map<Integer, Integer> female = new HashMap<>();
    static Map<Integer, Integer> male = new HashMap<>();
    static StringTokenizer st;
    static int answer;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        student = Integer.parseInt(st.nextToken());
        max = Integer.parseInt(st.nextToken());

        for (int i = 0; i < student; i++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());

            if(sex == 0){
                if(female.containsKey(grade)) female.put(grade, female.get(grade)+1);
                else female.put(grade, 1);
            }else{
                if(male.containsKey(grade)) male.put(grade, male.get(grade)+1);
                else male.put(grade, 1);
            }
        }

        for (Integer i : female.keySet()) {
            answer += (int) Math.ceil((double)female.get(i) / max);
        }

        for (Integer i : male.keySet()) {
            answer += (int) Math.ceil((double)male.get(i) / max);
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

}





