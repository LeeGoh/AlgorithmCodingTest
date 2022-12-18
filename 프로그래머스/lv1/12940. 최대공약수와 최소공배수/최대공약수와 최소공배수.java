class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if(m % n == 0) {
            answer[0] = n;
            answer[1] = m;
            return answer;
        }
        
        int max = 0;
        for(int i = 1; i <= n && i <= m; i++){
            if(n % i == 0 && m % i == 0) max = i;
        }
        
        answer[0] = max;
        answer[1] = max * (n/max) * (m/max);
        return answer;
    }
}