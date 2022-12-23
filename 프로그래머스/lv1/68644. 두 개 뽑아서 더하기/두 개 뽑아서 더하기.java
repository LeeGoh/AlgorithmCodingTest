import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++)
            set.add(numbers[i] + numbers[j]);
        }
        Integer[] arr = set.toArray(new Integer[0]);
        int[] answer = Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}