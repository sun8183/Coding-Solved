import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int T;
    static int cute;
    static int not_cute;
    
    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 1) cute++;
            else not_cute++;
        }

        if(cute > not_cute) bw.write("Junhee is cute!");
        else bw.write("Junhee is not cute!");
        bw.flush();
    }

}