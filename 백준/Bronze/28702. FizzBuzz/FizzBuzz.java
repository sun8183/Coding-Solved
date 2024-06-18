import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static String[] fizz = new String[3];
    static int answer;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 3; i++) {
            fizz[i] = br.readLine();
        }

        for (int i = 0; i < 3; i++) {
            if(fizz[i].chars().allMatch(Character::isDigit)){      // 숫자형 판별
                answer = Integer.parseInt(fizz[i]) + (3 - i);
            }
        }

        if(answer%3==0 && answer%5==0) bw.write("FizzBuzz");
        else if(answer % 3 == 0) bw.write("Fizz");
        else if(answer %5 == 0) bw.write("Buzz");
        else bw.write(answer+"");

        bw.flush();
    }
}