class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = 1;
        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' ') {
                index = 1;
                answer.append(" ");
                continue;  
            }
            
            if(index % 2 == 1) answer.append(Character.toUpperCase(ch));
            else answer.append(Character.toLowerCase(ch));

            index++;         
        }
        
        return answer.toString();
    }
}