import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int num;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if("all".equals(s)) num = (1<<21)-1;
            else if("empty".equals(s)) num = 0;
            else {
                String first = s.split(" ")[0];
                String second = s.split(" ")[1];

                if("check".equals(first)){
                    if((num&(1<<Integer.parseInt(second))) == (1<<Integer.parseInt(second)))bw.write("1"+"\n");
                    else bw.write("0"+"\n");
                }else if("toggle".equals(first)){
                    num ^= (1<<Integer.parseInt(second));
                }else if("remove".equals(first)){
                    num &= ~(1<<Integer.parseInt(second));
                }else {
                    num |= (1<<Integer.parseInt(second));
                }
            }

        }

        bw.flush();
    }

}
