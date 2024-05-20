import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static String target;
    static int N;
    static int first = 100;
    static int[] disabled;
    static int brute = 999_999;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        target = br.readLine();

        N = Integer.parseInt(br.readLine());

        if(N > 0) {
            disabled = new int[N];
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            for (int i = 0; i < N; i++) {
                disabled[i] = Integer.parseInt(st.nextToken());
            }
        }
        
        answer = Math.abs(Integer.parseInt(target) - first);
        
        for (int i = 0; i <= brute; i++) { /* 누를 수 있는 숫자로 채널을 만드는 로직 */
            String s = String.valueOf(i);

            if(s.length() == target.length()+2) break;

            boolean flag = false;
            for (int j = 0; j < s.length(); j++){
                char num = s.charAt(j);

                if (isDisabled(Integer.parseInt(num + ""))){
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                int temp = Math.abs(Integer.parseInt(s) - Integer.parseInt(target)) + s.length();
                answer = Math.min(answer, temp);
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

    public static boolean isDisabled(int i){
        if(N == 0) return false;
        else {
            for (int j = 0; j < disabled.length; j++) {
                if (i == disabled[j]) return true;
            }
        }
        return false;
    }
}
