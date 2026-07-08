import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int low = 0;
        int high = d.length;
        
        Arrays.sort(d);
        
        while(low <= high){
            int mid = (low + high) / 2;
            int sum = 0;
            
            for(int i=0; i<mid; i++){
                sum += d[i];
            }
            
            if(sum <= budget){
                answer = mid;
                low = mid + 1;
            }else{
                high = mid -1; 
            }
        }
        
        return answer;
    }
}