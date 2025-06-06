import java.io.*;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static String answer1, answer2;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        if(N == 1) answer1 = "11";
        else if(N >= 2 && N <= 4) answer1 = "9";
        else if(N >= 5 && N <= 10) answer1 = "8";


        if(N == 1) answer2 = "A B C D E F G H J L M";
        else if(N == 2 || N == 3) answer2 = "A C E F G H I L M";
        else if(N == 4) answer2 = "A B C E F G H L M";
        else if(N >= 5 && N <= 9) answer2 = "A C E F G H L M";
        else if(N == 10) answer2 = "A B C F G H L M";
        bw.write(answer1+"\n");
        bw.write(answer2);
        bw.flush();
    }
}
