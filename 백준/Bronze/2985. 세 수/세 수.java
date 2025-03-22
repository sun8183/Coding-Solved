import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int a,b,c;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        if(a == b + c) bw.write(a + "="+b+"+"+c);
        else if(a == b - c) bw.write(a + "="+b+"-"+c);
        else if(a == b / c) bw.write(a + "="+b+"/"+c);
        else if(a == b * c) bw.write(a + "="+b+"*"+c);
        else if(a + b == c) bw.write(a + "+"+b+"="+c);
        else if(a - b == c) bw.write(a + "-"+b+"="+c);
        else if(a / b == c) bw.write(a + "/"+b+"="+c);
        else if(a * b == c) bw.write(a + "*"+b+"="+c);

        bw.flush();
    }
}











