import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        
        for(int i=0; i< progresses.length; i++){
            queue.addLast((int) Math.ceil((100 - progresses[i]) / (double) speeds[i]));
        }
        
        while(!queue.isEmpty()){
            int maxDay = queue.poll();
            int count = 1;
            
            while(!queue.isEmpty() && queue.peek() <= maxDay){
                queue.poll();
                count++;
            }
            answer.add(count);
        }
        
        
        return answer;
    }
}