import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int a_score, b_score;
    static int [][]arr = new int[2][10];
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 10; i++) {
            if(arr[0][i] > arr[1][i]) a_score++;
            else if(arr[0][i] < arr[1][i]) b_score++;
        }
        
        bw.write(a_score > b_score ? "A" : a_score < b_score ? "B" : "D");
        bw.flush();
    }

}







