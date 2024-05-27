import java.io.*;
import java.util.ArrayDeque;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int T;
    static boolean[] visited;

    static int from;
    static int to;
    static ArrayDeque<Dslr> queue;

    public static void main(String[] args) throws IOException {
        try {
            T = Integer.parseInt(br.readLine());

            for (int i = 0; i < T; i++) {
                String s = br.readLine();
                from = Integer.parseInt(s.split(" ")[0]);
                to = Integer.parseInt(s.split(" ")[1]);

                queue = new ArrayDeque<>();
                queue.addLast(new Dslr(from, ""));
                visited = new boolean[10000];
                visited[from] = true;

                while (!queue.isEmpty()) {
                    Dslr tmp = queue.removeFirst();

                    if (tmp.nums == to) {
                        bw.write(tmp.str + "\n");
                        break;
                    }

                    if (!visited[D(tmp.nums)]) {
                        s = tmp.str;
                        Dslr d = new Dslr(D(tmp.nums), s + "D");
                        queue.addLast(d);
                        visited[d.nums] = true;
                    }

                    if (!visited[S(tmp.nums)]) {
                        s = tmp.str;
                        Dslr d = new Dslr(S(tmp.nums), s + "S");
                        queue.addLast(d);
                        visited[d.nums] = true;
                    }

                    if (!visited[C(tmp.nums, 'L')]) {
                        s = tmp.str;
                        Dslr d = new Dslr(C(tmp.nums, 'L'), s + "L");
                        queue.addLast(d);
                        visited[d.nums] = true;
                    }

                    if (!visited[C(tmp.nums, 'R')]) {
                        s = tmp.str;
                        Dslr d = new Dslr(C(tmp.nums, 'R'), s + "R");
                        queue.addLast(d);
                        visited[d.nums] = true;
                    }
                }
            }
            bw.flush();
        } finally {
            br.close();
            bw.close();
        }
    }

    public static class Dslr {
        int nums;
        String str;

        Dslr(int nums, String str) {
            this.nums = nums;
            this.str = str;
        }
    }

    public static int D(int n) {
        return n * 2 > 9999 ? 2 * n % 10000 : 2 * n;
    }

    public static int S(int n) {
        return n - 1 < 0 ? 9999 : n - 1;
    }

    public static int C(int n, char type) {
        int one = n / 1000;
        int two = n % 1000 / 100;
        int three = n % 100 / 10;
        int four = n % 10;

        if (type == 'L') return two * 1000 + three * 100 + four * 10 + one;
        else return four * 1000 + one * 100 + two * 10 + three;
    }
}
