import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int [] N = new int[4];

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 4; i++) {
            N[i] = Integer.parseInt(br.readLine());
        }

        if(N[0] < N[1] && N[1] < N[2] && N[2] < N[3]) bw.write("Fish Rising");
        else if(N[3] < N[2] && N[2] < N[1] && N[1] < N[0] ) bw.write("Fish Diving");
        else if(N[0] == N[1] && N[0] == N[2] && N [0] == N[3]) bw.write("Fish At Constant Depth");
        else bw.write("No Fish");
        bw.flush();
    }
}












