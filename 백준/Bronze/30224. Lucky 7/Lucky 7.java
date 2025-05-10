import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());

        if(!String.valueOf(N).contains("7") && N % 7 != 0) bw.write("0");
        else if(!String.valueOf(N).contains("7") && N % 7 == 0) bw.write("1");
        else if(String.valueOf(N).contains("7") && N % 7 != 0) bw.write("2");
        else bw.write("3");
        bw.flush();
    }
}













