import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        
        if(N == 1) bw.write("2024 8");
        else if(N == 2) bw.write("2025 3");
        else if(N == 3) bw.write("2025 10");
        else if(N == 4) bw.write("2026 5");
        else if(N == 5) bw.write("2026 12");
        bw.flush();
    }
}













