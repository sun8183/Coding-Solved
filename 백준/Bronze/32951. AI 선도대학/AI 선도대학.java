import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int year;

    public static void main(String[] args) throws IOException {
        year = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(year-2024));
        bw.flush();
    }
}












