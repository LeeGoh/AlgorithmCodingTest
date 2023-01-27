class Solution {
    public int solution(int n) {
        int sqrt = (int)Math.sqrt(n);
        if(n % sqrt == 0) return 1;
        else return 2;
    }
}