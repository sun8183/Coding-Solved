import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int target = 0;

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        N = Integer.parseInt(s);
        int i = 0;

        while(true){
            i++;
            target = ConStructor(i);
            if(target == N) break;
            else if(i > N) {
                i = 0;
                break;
            }

        }

        bw.write(String.valueOf(i));
        bw.flush();
    }

    static public int ConStructor(int n){
        int result = n;

        while(n > 0){
            result+= n % 10;
            n = n / 10;
        }
        return result;
    }
}