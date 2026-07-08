import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        float[][] fail = new float[N][2];
        Map<Integer, Integer> map = new HashMap<>();
        
        int together = stages.length;
        
        for(int i=0; i<stages.length; i++){
            map.put(stages[i], map.getOrDefault(stages[i], 0) + 1);
        }
        
        for(int i = 1; i <= N; i++){
            int failCnt = map.getOrDefault(i, 0);
            fail[i-1][0] = i;
            if(together != 0) fail[i-1][1] = (float) failCnt / together;
            together -= failCnt;
        }
        
        Arrays.sort(fail, (a, b) -> {
            int cmp = Float.compare(b[1], a[1]);
            return cmp != 0 ? cmp : Float.compare(a[0], b[0]);
        });
        
        for(int i=0; i<N; i++){
            answer[i] = (int) fail[i][0];
        }
        
        return answer;
    }
}