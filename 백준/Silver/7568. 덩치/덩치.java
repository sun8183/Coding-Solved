import java.io.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[][] people;
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        people = new int[N][2];

        int idx;

        for(int i=0; i<N; i++){
            String s = br.readLine();

            people[i][0] = Integer.parseInt(s.split(" ")[0]);
            people[i][1] = Integer.parseInt(s.split(" ")[1]);
        }

        for(int i=0; i<N; i++){
            idx = 1;
            for(int j=0; j<N; j++){
                if(i==j) continue;

                if(people[i][0] < people[j][0] && people[i][1] < people[j][1]){
                    idx++;
                }
            }

            bw.write(idx+" ");
        }

        bw.flush();
    }
}