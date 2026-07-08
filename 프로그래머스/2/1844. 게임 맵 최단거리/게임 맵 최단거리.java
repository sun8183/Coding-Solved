import java.util.*;

class Solution {
    
    public int solution(int[][] maps) {
        Deque<int[]> queue = new ArrayDeque<>();
        
        int[][] visited = new int[maps.length][maps[0].length];
        int[] dr = {1, 0, -1, 0};
        int[] dc = {0, 1, 0, -1};
        
        int[] current = {0, 0};
        int[] end = {maps.length-1, maps[0].length -1};
        visited[0][0] = 1;

        queue.addFirst(current);
        boolean b = false;
        
        while(!queue.isEmpty()){
            current = queue.removeFirst();
            
            if(current[0] == end[0] && current[1] == end[1]){
                b = true;
                break;
            }
            
            int cur_r = current[0];
            int cur_c = current[1];
            
            for(int i=0; i< 4; i++){
                int nr = cur_r + dr[i];
                int nc = cur_c + dc[i];
                
                if(nr < 0 || nc < 0 || nr >= maps.length || nc >= maps[0].length){
                    continue;
                }
                
                if(maps[nr][nc] == 0 || visited[nr][nc] > 0){
                    continue;
                }
                
                visited[nr][nc] = visited[cur_r][cur_c] + 1;
                queue.addLast(new int[]{nr, nc});
            }
        }
        
        return b ? visited[maps.length-1][maps[0].length -1] : -1;
    }
}