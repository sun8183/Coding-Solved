class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int index = 0;
        
        while(index < section.length){
            int right = section[index] + m;
            answer++;
            
            while(index < section.length && section[index] < right){
                index++;           
            }
        }
        
        return answer;
    }
}