class Solution {
    public int solution(int[] stones, int k) {
        int answer = 0;
        int hi = 0;
        int lo = 1;
        
        for(int i=0; i<stones.length; i++){
            hi = Math.max(hi, stones[i]);
        }

        while(lo <= hi){
            int mid = lo + (hi-lo) / 2;
            if(isCheck(stones, mid, k)){
                answer = mid;
                lo = mid + 1;
            }
            else hi = mid -1;
        }
        
        return answer;
    }
    
    public boolean isCheck(int[] stones, int mid, int k){
        int current = 0;
        for(int i=0; i<stones.length; i++){
            if(stones[i] < mid){
                current++;
            }else{
                current = 0;
            }

            if(current >= k) return false;
        }
        return true;
    }
}