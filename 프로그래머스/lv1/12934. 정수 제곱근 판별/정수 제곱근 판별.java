class Solution {
    public long solution(long n) {
        double N = Math.sqrt(n);
        long M = (long)N + 1;
        if(N % 1 == 0) return M * M;
        else return -1;
        
    }
}