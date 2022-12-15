class Solution {
    public String solution(int n) {
        int m = 0;
        String answer = "";
        while(n != 0){
            if(n % 2 != 0){
                answer = "수" + answer;
            } else {
                answer = "박" + answer;
            }
            n = n - 1;
        }
        return answer;
    }
}