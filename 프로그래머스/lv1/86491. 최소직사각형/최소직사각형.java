import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        List<Integer> horizontal = new ArrayList();
        List<Integer> vertical = new ArrayList();
        
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                horizontal.add(sizes[i][0]);
                vertical.add(sizes[i][1]);
            } else {
                horizontal.add(sizes[i][1]);
                vertical.add(sizes[i][0]);
            }
        }
        
        Collections.sort(horizontal, Collections.reverseOrder());
        Collections.sort(vertical, Collections.reverseOrder());
        
        answer = horizontal.get(0) * vertical.get(0);
        
        return answer;
    }
}