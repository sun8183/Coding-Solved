import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int[] cache = new int[sequence.length + 1];
        
        int left = 0;
        int right = 1;
        
        List<int []> list = new ArrayList();
        
        cache[1] = sequence[0];
        for(int i = 1; i < sequence.length; i++){
            cache[i+1] = sequence[i] + cache[i];
        }
        
        while(right < cache.length){
            int sum = cache[right] - cache[left];
            
            if(sum == k){
                list.add(new int[]{left, right -1});
                right ++;
            }else if(sum > k){
                left ++;
            }else {
                right ++;
            }
        }
        
        int tmp = 1_000_000_000;
        for(int[] result : list){
            int sum = Math.abs(result[0] - result[1]);
            if(sum < tmp){
                answer = result;
                tmp = sum;
            }
        }
         
        return answer;       
    }
}