import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static int N;
    static String[] mbti;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());

            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            mbti = new String[N];
            int answer = 100_000;
            if(N > 32){
                answer = 0;
            }else {

                for (int j = 0; j < N; j++) {
                    mbti[j] = st.nextToken();
                }

                for (int j = 0; j < N-2; j++) {
                    for (int k = j+1; k < N-1; k++) {
                        for (int l = k+1; l < N; l++) {
                            answer = Math.min(answer, psy_dist(mbti[j], mbti[k], mbti[l]));
                        }
                    }
                }
            }

            bw.write(answer+"\n");
        }

        bw.flush();
    }

    public static int psy_dist(String one, String two, String three){
        int result = 0;
        String[] person = new String[4];
        person[0] = one;
        person[1] = two;
        person[2] = three;
        person[3] = one;

        for (int i = 0; i < person.length -1; i++) {
            for (int j = 0; j < 4; j++) {
                if(person[i].charAt(j) != person[i+1].charAt(j)) result++;
            }
        }
        return result;
    }
}