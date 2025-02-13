import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        if(N >= 620 && 780 >= N) bw.write("Red");
        else if(N >= 590 && 620 > N) bw.write("Orange");
        else if(N >= 570 && 590 > N) bw.write("Yellow");
        else if(N >= 495 && 570 > N) bw.write("Green");
        else if(N >= 450 && 495 > N) bw.write("Blue");
        else if(N >= 425 && 450 > N) bw.write("Indigo");
        else bw.write("Violet");
        bw.flush();
    }

}









