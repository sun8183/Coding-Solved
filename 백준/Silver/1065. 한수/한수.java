import java.io.*;
public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        int answer=0;

        if(n < 100) answer = n;
        else {
            answer = 99;
            for(int i = 100; i <= n; i++){
                if(isNum(i)) answer ++;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
    }

   static boolean isNum(int num){
        boolean b = false;
        int idx = 1;
        int x = 0; // 100의 자리
        int y = 0; // 10의 자리
        int z = 0; // 1의 자리

        if(num == 1000) return false;

        while(idx < 5){
            String s = String.valueOf(num);

            x = Integer.parseInt(s.charAt(0)+"");
            y = Integer.parseInt(s.charAt(1)+"");
            z = Integer.parseInt(s.charAt(2)+"");

            if(x == y - idx && y == z - idx){
                b = true;
                break;
            }else if(z == y - idx && y == x - idx){
                b = true;
                break;
            }else if(x == y && x == z){
                b = true;
                break;
            }else{
                idx++;
            }
        }
        return b;
    }
}