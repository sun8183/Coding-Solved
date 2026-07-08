import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, int[]> keyPad = new HashMap<>();
        
        for(int i=1; i<=9; i++){
            keyPad.put(i, new int[]{(i-1)/3, (i-1)%3});
        }
        
        keyPad.put(-1, new int[]{3, 0});
        keyPad.put(0, new int[]{3, 1});
        keyPad.put(-2, new int[]{3, 2});
        
        int[] left = keyPad.get(-1);
        int[] right = keyPad.get(-2);
        
        for(int i=0; i<numbers.length; i++){
            int num = numbers[i];
            int[] position = keyPad.get(num);
            int leftPos = dist(position, left);
            int rightPos = dist(position, right);
            
            boolean useLeft;
            if(position[1] == 0) useLeft = true;
            else if(position[1] == 2) useLeft = false;
            else if(leftPos != rightPos) useLeft = leftPos < rightPos;
            else useLeft = !"right".equals(hand);

            if(useLeft){ left = position; sb.append("L"); }
            else { right = position; sb.append("R"); }
        }
        
        return sb.toString();
    }
    
    public int dist(int [] pos, int [] flow){
        return Math.abs(pos[0] - flow[0]) + Math.abs(pos[1] - flow[1]);
    }
}