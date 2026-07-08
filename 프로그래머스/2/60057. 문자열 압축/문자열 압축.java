import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        for(int i=1; i<= s.length() / 2; i++){
            StringBuilder sb = new StringBuilder();
            int count = 1;
            String ch = s.substring(0, i);
            
            for(int j=i; j<s.length(); j = j + i){
                String next = s.substring(j, Math.min(j+i, s.length()));
                if(ch.equals(next)){
                    count++;
                }else{
                    if(count > 1){
                        sb.append(count + ch);
                        count = 1;
                    }else{
                        sb.append(ch);
                    }
                    ch = next;
                }
            }
            
            if(count > 1) sb.append(count + ch);
            else sb.append(ch);
            
            answer = Math.min(answer, sb.length());
        }
        
        
        return answer;
    }
}