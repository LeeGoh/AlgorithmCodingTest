import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr1 = new String[s.length()/2];
        arr1 = s.split(" ");
        
        Integer[] arr2 = new Integer[arr1.length];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = Integer.parseInt(arr1[i]);
        }
        Arrays.sort(arr2);
        
        answer = arr2[0] + " " + arr2[arr2.length-1];
        return answer;
    }
}