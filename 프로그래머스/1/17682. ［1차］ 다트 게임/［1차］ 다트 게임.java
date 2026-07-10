import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int num = 0;
        for(int i=0; i<dartResult.length(); i++){
            char ch = dartResult.charAt(i);
            
            if(ch == 'S'){
                stack.addFirst(num);
            }else if(ch == 'D'){
                stack.addFirst(num * num);
            }else if(ch == 'T'){
                stack.addFirst(num * num * num);
            }else if(ch == '*'){
                if(stack.size() == 1) stack.addFirst(stack.removeFirst() * 2);
                else{
                    int a = stack.removeFirst() * 2;
                    int b = stack.removeFirst() * 2;
                    
                    stack.addFirst(b);
                    stack.addFirst(a);
                }
                
            }else if(ch == '#'){
                stack.addFirst(stack.removeFirst() * -1);
            }else {
                if(ch == '1' && i+1 < dartResult.length() && dartResult.charAt(i+1) == '0') {
                    num = 10;
                    i++;
                }
                else num = Integer.parseInt(ch+"");   
            }
        }
        
        while(!stack.isEmpty()){
            
            answer += stack.removeFirst();
            System.out.println(answer);
        }
        return answer;
    }
}