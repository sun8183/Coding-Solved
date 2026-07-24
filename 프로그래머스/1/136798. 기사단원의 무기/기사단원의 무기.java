class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++){
            int result = division(i);
            if(result <= limit) answer += result;
            else answer += power;
        }
        return answer;
    }
    
    public int division(int num){
        int result = 0;
        
        for(int i=1; i<= num; i++){
            if(num%i == 0){
                result++;
            }
        }
        
        return result;
    }
}