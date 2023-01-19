import java.util.*;

class Solution {
    public int solution(String s) {
        int count = 0;
        int noCount = 0;
        int answer = 0;
        char sc = s.charAt(0);

        for(int i = 0; i < s.length(); i++){
            if(count == noCount){
                answer++;
                sc = s.charAt(i);
            }
            
            if(sc == s.charAt(i)) {
                count++;
            }
            else noCount++;
        }
        return answer;
    }
}