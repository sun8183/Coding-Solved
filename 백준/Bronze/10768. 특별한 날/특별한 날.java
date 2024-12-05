import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int mm, dd;

    public static void main(String[] args) throws IOException {
        mm = Integer.parseInt(br.readLine());
        dd = Integer.parseInt(br.readLine());

        if(mm > 2) bw.write("After");
        else if(mm == 2){
            if(dd == 18) bw.write("Special");
            else if(dd > 18) bw.write("After");
            else bw.write("Before");
        }else bw.write("Before");

        bw.flush();
    }

}

