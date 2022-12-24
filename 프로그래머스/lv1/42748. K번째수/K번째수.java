import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] index = {};
        
        for(int i = 0; i < commands.length; i++){
            index = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(index);
            answer[i] = index[commands[i][2]-1];
        }
        
        return answer;
    }
}