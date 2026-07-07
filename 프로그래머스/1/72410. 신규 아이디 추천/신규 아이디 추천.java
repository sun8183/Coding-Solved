class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        if(valid(new_id)) return new_id;
        else {
            new_id = step1(new_id);
            new_id = step2(new_id);
            new_id = step3(new_id);
            new_id = step4(new_id);
            // 5단계 
            if(new_id.equals("")) new_id = "a";
            
            // 6단계
            if(new_id.length() >= 16) {
                new_id = new_id.substring(0, 15);
                if(new_id.charAt(14) == '.') new_id = new_id.substring(0, 14);
            }
            // 7단계 
            if(new_id.length() <= 2){
                while(new_id.length() < 3){
                    new_id += new_id.charAt(new_id.length() -1);
                }
            }
        }
        return new_id;
    }
    
    public String step1(String id){
        return id.toLowerCase();
    }
    
    public String step2(String id){
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<id.length(); i++){
            char ch = id.charAt(i);
            
            if(ch >= 'a' && ch <= 'z') result.append(ch);
            else if(ch >= '0' && ch <= '9') result.append(ch);
            else if(ch == '-' || ch == '_' || ch == '.') result.append(ch);
            else continue;
            
        }
        
        return result.toString();
    }
    
    public String step3(String id){
        StringBuilder result = new StringBuilder();
        int index=0;
        result.append(id.charAt(0));
        for(int i=1; i< id.length(); i++){
            char ch = id.charAt(i);
            char chLast = id.charAt(i-1);
            
            if(ch == '.' && chLast == '.'){
                continue;
            }
            
            result.append(ch);
        }
        
        return result.toString();
    }
    
    public String step4(String id){
        if(id.length() == 0) {
            return id;
        }
        
        if(id.length() == 1){
            if(id.equals(".")) return "";
        }
        int index = 0;
        char ch = id.charAt(0);
        char chLast = id.charAt(id.length()-1);
        
        if(ch == '.') id = id.substring(1);
        if(chLast == '.') id = id.substring(0, id.length()-1);
        
        return id;
    }
    
    public boolean valid(String id){
        int len = id.length();
        char s1 = id.charAt(0);
        char s2 = id.charAt(len-1);
        int index = 0;
        
        if(len < 3 || len > 15) return false;
        
        if(s1 == '.' || s2 == '.') return false;
        
        for(int i=0; i< len; i++){
            char ch = id.charAt(i);
            
            if(ch >= 'a' && ch <= 'z') continue;
            else if(ch >= '0' && ch <= '9') continue;
            else if(ch == '-' || ch == '_') continue;
            
            if(ch == '.' && index == 0){
                index++;
                continue;
            }else {
                return false;
            }
        }
        
        return true;
    }
}