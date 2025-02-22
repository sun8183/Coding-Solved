import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int switchCnt, studentCnt;
    static int []s;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        switchCnt = Integer.parseInt(br.readLine());
        s = new int[switchCnt+1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= switchCnt; i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }

        studentCnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < studentCnt; i++) {
            st = new StringTokenizer(br.readLine());

            int sex = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());

            if (sex == 1) {
                int idx = 1;
                while (number * idx <= switchCnt) {
                    switchFunc(number * idx);
                    idx++;
                }

            } else {
                int left = number - 1;
                int right = number + 1;

                while (left > 0 && right <= switchCnt) {
                    if (s[left] == s[right]) {
                        left--;
                        right++;
                    } else break;
                }
                left++;
                right--;

                for (int j = left; j <= right; j++) {
                    switchFunc(j);
                }
            }
        }

        for (int i = 1; i <= switchCnt; i++) {
            bw.write(s[i]+" ");
            if(i%20 == 0) bw.write("\n");
        }
        bw.flush();
    }

    public static void switchFunc(int index){
        if(s[index] == 0) s[index] = 1;
        else s[index] = 0;
    }
}
