import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        while(true){
            sb = new StringBuilder(br.readLine());

            if(sb.toString().equals("END")) break;
            else bw.write(sb.reverse().toString()+"\n");
        }

        bw.flush();
    }

}
