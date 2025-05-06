import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static int N;
    static String [] uos = {"U", "O", "S"};

    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());
        N --;
        bw.write(uos[N%3]);
        bw.flush();
    }
}













