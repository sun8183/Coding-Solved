import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;

    public static void main(String[] args) throws IOException {

        while(true) {
            String s = br.readLine();

            N = Integer.parseInt(s.split(" ")[0]);
            M = Integer.parseInt(s.split(" ")[1]);

            if(N == 0 && M == 0) break;

            if (N > M) {
                if (N % M == 0) bw.write("multiple");
                else bw.write("neither");
            } else {
                int i=1;
                int nums = N;

                while (true) {
                    if (nums == M) {
                        bw.write("factor");
                        break;
                    }
                    else if(nums < M) nums = N*i++;
                    else{
                        break;
                    }
                }
            }

            bw.write("\n");
        }
        bw.flush();
    }
}

