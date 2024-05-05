import java.io.*;
import java.util.*;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;

    static ArrayDeque<Integer> stack = new ArrayDeque<>();
    static ArrayList<String> list = new ArrayList<>();

    static int[] nums;

    public static void main(String[] args) throws IOException {
        
        N = Integer.parseInt(br.readLine());
        nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int push = 1;
        int index = 0;
        boolean flag = false;

        while(index < N){    // list 사이즈가 N과 같을때 반복문 종료
            if(push <= nums[index]){
                stack.addLast(push);
                list.add("+");
                push++;
            }else{
                if(stack.peekLast() == nums[index]){
                    stack.removeLast();
                    list.add("-");
                    index++;
                }else{
                    flag = true;
                    break;
                }
            }
        }

        if(flag) bw.write("NO");

        else {
            for (String s : list) {
                bw.write(s + "\n");
            }
        }


        bw.flush();
    }
}