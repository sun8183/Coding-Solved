import java.util.*;

class Solution {
    public List<Integer> solution(String[] genres, int[] plays) {
        Map<String, Integer> genresCnt = new HashMap<>();
        Map<String, List<int []>> listMap = new HashMap<>();
        List<Map.Entry<String, Integer>> genresList;
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<plays.length; i++){
            List list = listMap.getOrDefault(genres[i], new ArrayList<>());
            list.add(new int[]{i, plays[i]});
            listMap.put(genres[i], list);
            
            genresCnt.put(genres[i], genresCnt.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        genresList = new ArrayList<>(genresCnt.entrySet());
        genresList.sort((a, b) -> b.getValue() - a.getValue());
        
        for(int i=0; i<genresList.size(); i++){
            Map.Entry<String, Integer> entry = genresList.get(i);
            List<int []> lst = listMap.get(entry.getKey());
            
            lst.sort((a, b) -> {
                int tmp = b[1] - a[1];
                return tmp == 0 ? a[0] - b[0] : tmp;
            }); 
            
            answer.add(lst.get(0)[0]);
            if(lst.size() > 1) answer.add(lst.get(1)[0]);
        }
        
        
        return answer;
    }
}