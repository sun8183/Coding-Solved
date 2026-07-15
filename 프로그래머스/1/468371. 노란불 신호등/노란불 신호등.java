class Solution {
    public int solution(int[][] signals) {
        int answer = -1;
        int limit = 1;
        
        for(int i=0; i<signals.length; i++){
            int cycle = signals[i][0] + signals[i][1] + signals[i][2];
            limit = lcm(cycle, limit);
        }
        
        for (int t = 1; t <= limit; t++) {
            boolean ok = true;

            for (int[] signal : signals) {
                int g = signal[0];
                int y = signal[1];
                int cycle = g + y + signal[2];

                int now = t % cycle;

                if (now < g || now >= g + y) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                answer = t + 1;
                break;
            } 
        }
        
        
        return answer;
    }     
    
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}