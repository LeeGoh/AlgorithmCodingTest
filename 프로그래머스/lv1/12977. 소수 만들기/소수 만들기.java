import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        List<Integer> list = new ArrayList();
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        
        for(int i = 0; i < list.size(); i++){
            boolean isPrimeNum = true;
            for(int j = 2; j <= Math.sqrt(list.get(i)); j++){
                if(list.get(i) % j == 0){
                    isPrimeNum = false;
                    break;
                }
            }
            if(isPrimeNum) answer++;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}