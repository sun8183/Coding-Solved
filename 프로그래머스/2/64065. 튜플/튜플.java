import java.util.*;

class Solution {
    public List<Integer> solution(String s) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        s = s.replace("{", "");
        s = s.replace("}", "");
        
        String[] arr = s.split(",");
        
        for(int i=0; i<arr.length; i++){
            int num = Integer.parseInt(arr[i]);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        
        for(int i = 0; i<list.size(); i++){
            answer.add(list.get(i).getKey());
        }
        
        return answer;
    }
}