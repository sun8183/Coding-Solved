import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean [] visited = new boolean[n];
        
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i = 0; i< n; i++){
            if(visited[i]) continue;
            
            queue.addLast(i);
            visited[i] = true;
            answer++;
            
            while(!queue.isEmpty()){
                int start = queue.removeFirst();
                for(int j=0; j<n; j++){
                    if(visited[j] || start == j) continue;
                    
                    if(computers[start][j] == 1){
                        queue.addLast(j);
                        visited[j] = true;   
                    }
                }
            }
        }
        
        return answer;
    }
}