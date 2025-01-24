import java.io.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int money;

    public static void main(String[] args) throws IOException {
        money = Integer.parseInt(br.readLine());
                
        bw.write(String.valueOf(money/11*10));        
        bw.flush();
    }
}
