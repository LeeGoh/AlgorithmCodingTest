import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int count = 0;
        List<Integer> ex = new ArrayList(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        ex.add(0);
        Arrays.sort(numbers);
        for(int i = 0; i < ex.size(); i++){
            for(int j = 0; j < numbers.length; j++){
                if(ex.get(i) == numbers[j]) {
                    ex.set(i, 0);
                }
            }
            answer += ex.get(i);
        }
        return answer;
    }
}