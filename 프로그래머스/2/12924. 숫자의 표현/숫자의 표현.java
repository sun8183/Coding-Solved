class Solution {
    public int solution(int n) {
        int left = 1;
        int right = 1;
        int answer = 0;       
        int sum = 1;
        
        while(left <= right && right <= n){
            if(sum == n) {
                answer ++;
                sum -= left;
                left++;
            }
            else if(sum < n) {
                right++;
                sum += right;   
            }
            else {
                sum -= left;
                left++;
            }
        }
        
        return answer;
    }
}