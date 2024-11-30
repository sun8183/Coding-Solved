import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int[][] bingo = new int[5][5];
    static Map<Integer, Integer> index = new HashMap<Integer, Integer>();
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());
                bingo[i][j] = num;
                index.put(num, i*5 + j);
            }
        }

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int x, y, num;
                num = Integer.parseInt(st.nextToken());

                int cal = index.get(num);
                x = cal / 5;
                y = cal % 5;
                bingo[x][y] = 0;

                if(isBingo()){
                    bw.write(String.valueOf(i*5+j+1));
                    i = 5;
                    j = 5;
                }
            }
        }
        bw.flush();
    }

    public static boolean isBingo(){
        int result = 0;

        for (int i = 0; i < 5; i++) {
            if(bingo[i][0] == 0 && bingo[i][1] == 0 && bingo[i][2] == 0 && bingo[i][3] == 0 && bingo[i][4] == 0){result++;}
            if(bingo[0][i] == 0 && bingo[1][i] == 0 && bingo[2][i] == 0 && bingo[3][i] == 0 && bingo[4][i] == 0){result++;}
        }

        if(bingo[0][0] == 0 && bingo[1][1] == 0 && bingo[2][2] == 0 && bingo[3][3] == 0 && bingo[4][4] == 0) result++;
        if(bingo[0][4] == 0 && bingo[1][3] == 0 && bingo[2][2] == 0 && bingo[3][1] == 0 && bingo[4][0] == 0) result++;

        return result >= 3;
    }
}
