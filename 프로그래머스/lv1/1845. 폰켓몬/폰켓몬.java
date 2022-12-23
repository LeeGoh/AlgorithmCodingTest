import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length/2;
        Set<Integer> set = new HashSet();
        for(int i = 0 ; i < nums.length; i++){
            set.add(nums[i]);
        }
        if(set.size() < length) answer = set.size();
        else answer = length;
        return answer;
    }
}