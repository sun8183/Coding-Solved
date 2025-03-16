import java.io.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] cache = new int[51];
    static int T, N;
    static boolean isAnswer;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 50; i++){
            cache[i] = cache[i-1] + i;
        }

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());

            int a, b, c;
            isAnswer = false;
            for (int j = 1; j <= 50; j++) {
                a = cache[j];
                for (int k = j; k <= 50; k++) {
                    b = cache[k];
                    for (int l = k; l <= 50; l++) {
                        c = cache[l];
                        if(a+b+c == N){
                            j = 51;
                            k = 51;
                            isAnswer = true;
                            break;
                        }
                    }
                }
            }

            bw.write(isAnswer ? "1" : "0");
            bw.write("\n");
        }

        bw.flush();
    }
}
