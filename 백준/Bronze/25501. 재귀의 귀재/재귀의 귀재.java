import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;

    static int answer = 0;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            bw.write(String.valueOf(isPalindrome(s))+" ");
            bw.write(String.valueOf(answer)+"\n");
        }

        bw.flush();
    }

    public static int recursion(String s, int l, int r){
        answer++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s){
        answer = 0;
        return recursion(s, 0, s.length()-1);
    }
}
