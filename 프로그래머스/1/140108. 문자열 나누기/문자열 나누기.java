class Solution {
    public int solution(String s) {
        int answer = 1;
        char ch = s.charAt(0);
        int chCnt = 1;
        int otherCnt = 0;
        boolean flag = false;
        for(int i=1; i<s.length(); i++){
            char tmp = s.charAt(i); 
            if(flag) {
                ch = tmp;
                answer++;
                flag = false;
                continue;
            }
            
            if(tmp == ch) chCnt ++;
            else{
                otherCnt++;
                if(chCnt == otherCnt){
                    flag = true;
                    chCnt = 1;
                    otherCnt = 0;
                }
            }
            
        }
        return answer;
    }
}