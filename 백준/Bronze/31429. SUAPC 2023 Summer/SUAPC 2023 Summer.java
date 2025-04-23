import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        if(N == 1) bw.write("12 1600");
        else if(N == 2) bw.write("11 894");
        else if(N == 3) bw.write("11 1327");
        else if(N == 4) bw.write("10 1311");
        else if(N == 5) bw.write("9 1004");
        else if(N == 6) bw.write("9 1178");
        else if(N == 7) bw.write("9 1357");
        else if(N == 8) bw.write("8 837");
        else if(N == 9) bw.write("7 1055");
        else if(N == 10) bw.write("6 556");
        else if(N == 11) bw.write("6 773");
        
        
        
        
        bw.flush();
    }
}













