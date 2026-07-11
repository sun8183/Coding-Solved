import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int i=0; i<scoville.length; i++){
            queue.offer(scoville[i]);
        }
        
        while(queue.peek() < K && queue.size() > 1){
            int a = queue.poll();
            int b = queue.poll();
            
            int sum = a + b*2;
            queue.offer(sum);
            answer++;
        }
        
        if(queue.peek() < K) answer = -1;
        return answer;
    }
}