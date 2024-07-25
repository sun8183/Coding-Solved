import java.io.*;
import java.util.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    static int N, M;
    static HashMap<String, Integer> map = new HashMap<String, Integer>();
    static ArrayList<word> list = new ArrayList<word>();
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            s = br.readLine();
            if(s.length() >= M){
                if(map.get(s) != null) map.put(s, map.get(s) + 1);
                else map.put(s, 1);
            }
        }

        for (String name : map.keySet()) {
            word w = new word(name, name.length(), map.get(name));

            list.add(w);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i).name+"\n");
        }
        bw.flush();
    }

    public static class word implements Comparable<word> {
        String name;
        int len;
        int cnt;

        word(String name, int len, int cnt){
            this.name = name;
            this.len = len;
            this.cnt = cnt;
        }

        @Override
        public int compareTo(word o) {
            if(this.cnt > o.cnt) {
                return -1;
            }else if(this.cnt == o.cnt) {
                if(this.len > o.len) {
                    return -1;
                }else if(this.len == o.len){
                    return this.name.compareTo(o.name);
                }else return 1;
            }else return 1;
        }
    }
}
