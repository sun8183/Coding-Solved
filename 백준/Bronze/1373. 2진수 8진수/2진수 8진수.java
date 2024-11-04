import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String s;

    public static void main(String[] args) throws IOException {
        s = br.readLine();

        StringBuilder tmp= new StringBuilder();
        StringBuilder answer = new StringBuilder();

        for (int i = s.length()-1; i >= 0; i--) {
            tmp.append(s.charAt(i));

            if(tmp.length() == 3){
                int num = 0;
                for (int j = 0; j < tmp.length(); j++) {
                    if(tmp.charAt(j) == '1') num += (int)Math.pow(2, j);
                }
                answer.insert(0, num);
                tmp = new StringBuilder();
            }
        }

        if(tmp.length() > 0) {
            int num = 0;
            for (int j = 0; j < tmp.length(); j++) {
                if(tmp.charAt(j) == '1') num += (int)Math.pow(2, j);
            }
            answer.insert(0, num);
        }

        bw.write(answer.toString());
        bw.flush();
    }

}
