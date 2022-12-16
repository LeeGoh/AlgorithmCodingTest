import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }
        Arrays.sort(copy);
        
        List<Integer> list = new ArrayList();
        answer = new int[arr.length-1];
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != copy[0]) list.add(arr[i]);
        }
        
        for(int i = 0; i < answer.length; i ++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}