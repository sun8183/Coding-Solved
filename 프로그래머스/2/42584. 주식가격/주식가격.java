import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Deque<Integer> stack = new ArrayDeque<>();
        int [] answer = new int[prices.length];
        
        int price = prices[0];
        stack.addFirst(0);
        
        for(int i = 1; i< prices.length; i++){
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()])
            {
                int num = stack.removeFirst();
                answer[num] = i - num;
            }
            stack.addFirst(i);
        }
        
        while(!stack.isEmpty())
        {
            int num = stack.removeFirst();
            answer[num] = prices.length - 1 - num;
        }
        
        return answer;
    }
}