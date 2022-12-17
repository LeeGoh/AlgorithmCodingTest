import java.util.*;

class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false;
        
        int count = 0;
        List<Character> list = new ArrayList(List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));
        
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < s.length(); j++){
                if(list.get(i) == s.charAt(j)) count++;
            }
        }
        if(count == s.length()) return true;
        return false;
    }
}