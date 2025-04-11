import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] score = new int[8];
    static int[] answer = new int[5];
    static int sum;
    static HashMap<Integer, Integer> index = new HashMap<>();

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(br.readLine());
            index.put(score[i], i+1);
        }

        Arrays.sort(score);

        for (int i = 0; i < answer.length; i++) {
            sum = sum + score[score.length-1-i];
            answer[i] = index.get(score[score.length-1-i]);
        }

        bw.write(sum+"\n");

        Arrays.sort(answer);
        for (int i = 0; i < answer.length; i++) {
            bw.write(answer[i]+" ");
        }

        bw.flush();
    }
}
