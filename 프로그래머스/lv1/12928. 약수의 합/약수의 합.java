class Solution {
    public int solution(int n) {
        int sum = 0;
        int sqrt = (int) Math.sqrt(n);
        // for(int i = 1; i <= n; i++){
        //     if(n % i == 0) sum = sum + i;
        // }
        for(int i = 1; i <= sqrt; i++){
            if(n % i == 0) {
                sum = sum + i + (n/i);
                if(i == n/i) sum = sum - i;
                // if(sqrt * sqrt == n) sum = sum + i + (n/i) - sqrt;
                // else sum = sum + i + (n/i);
            } 
        }
        return sum;
    }
}