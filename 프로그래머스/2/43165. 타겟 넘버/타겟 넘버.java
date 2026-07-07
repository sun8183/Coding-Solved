import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {
        Deque<int []> queue = new ArrayDeque<>();
        queue.addFirst(new int[]{0, 0});
        
        int answer = 0;
        
        while(!queue.isEmpty()){
            int[] cur = queue.removeFirst();
            int index = cur[0], sum = cur[1];
            
            if(index == numbers.length){
                if(sum == target) answer++;
                continue;
            }
            
            queue.addFirst(new int[]{index + 1, sum + numbers[index]});
            queue.addFirst(new int[]{index + 1, sum - numbers[index]});
        }
        
        return answer;
    }
}