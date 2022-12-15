class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int y = x;
        while(x != 0){
            sum = sum + (x % 10);
            x = x / 10;
        }
        if(y % sum == 0) return true;
        return false;
    }
}