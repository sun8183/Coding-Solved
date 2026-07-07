import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<numbers.length; i++){
            list.add(numbers[i]+"");
        }
        
        list.sort((a, b) -> (b+a).compareTo(a+b));
        if(list.get(0).equals("0")) return "0";
        
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i));
        }
        
        return sb.toString();
    }
}