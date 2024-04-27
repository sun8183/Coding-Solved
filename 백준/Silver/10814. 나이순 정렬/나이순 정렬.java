import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static ArrayList<member> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());


        for(int i=0; i<N; i++){
            String s = br.readLine();
            member member = new member(i, Integer.parseInt(s.split(" ")[0]), s.split(" ")[1]);
            list.add(member);
        }

        list.sort(new Comparator<member>() {
            @Override
            public int compare(member o1, member o2) {

                if(o1.age != o2.age) return o1.age - o2.age;
                else return o1.num - o2.num;
            }
        });

        for(int i=0; i<N; i++){
            bw.write(list.get(i).age + " " + list.get(i).name);
            bw.write("\n");
        }

        bw.flush();
    }

    public static class member{
        public int num;
        public int age;
        public String name;

        member(int num, int age, String name){
            this.num = num;
            this.age = age;
            this.name = name;
        }
    }

}