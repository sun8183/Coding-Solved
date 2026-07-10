import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int choice = nums.length / 2;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        for(Integer key : map.keySet()){
            choice--;
            answer++;
            if(choice == 0) break;
        }
        
        return answer;
    }
}