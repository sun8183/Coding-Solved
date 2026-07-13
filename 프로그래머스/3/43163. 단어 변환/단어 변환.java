import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int[][] visited = new int[words.length + 1][2];
        // 1(방문함), 2(깊이 얼마나 걸림)
        Deque<int []> queue = new ArrayDeque<>();
        
        queue.addFirst(new int[]{0, 1});
        boolean isSearch = false;
        
         for (int i = 0; i < words.length; i++) {
              String s = words[i];
              int matchCnt = 0;
              for (int j = 0; j < s.length(); j++) {
                  if (s.charAt(j) != begin.charAt(j)) {
                      matchCnt++;
                  }
              }
              if (matchCnt == 1) {
                  queue.addFirst(new int[]{i, 1});
              }
          }
        
        while(!queue.isEmpty()){
            int [] cur = queue.removeFirst(); 
            begin = words[cur[0]];
            int index = cur[0];
            visited[index][0] = 1;
            visited[index][1] = 1;
            
            if(begin.equals(target)){
                isSearch = true;
                answer = cur[1];
                break;
            }
                
            for(int i=0; i<words.length; i++){
                if(visited[i][1] != 1){
                    String s = words[i];
                    
                    int matchCnt = 0;
                    for(int j=0; j<s.length(); j++){
                        if(s.charAt(j) != begin.charAt(j)){
                            matchCnt++;
                        }
                    }
                    
                    if(matchCnt == 1){
                        queue.addFirst(new int[]{i, cur[1] + 1});
                    }
                }
            }
        }
                   
        return isSearch ? answer : 0;
    }
}