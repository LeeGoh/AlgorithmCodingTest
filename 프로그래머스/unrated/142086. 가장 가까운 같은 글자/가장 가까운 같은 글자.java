import java.util.*;

class Solution {
    public int[] solution(String s) {
        int count = 0;
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for(int i = 1; i < s.length(); i++){
            count = 0;
            for(int j = 0; j < i; j++){
                if(s.charAt(i) == s.charAt(j)) {
                    answer[i] = i-j;
                    count++;
                }
                if(count == 0) answer[i] = -1; 
            }
        }
        return answer;
    }
}