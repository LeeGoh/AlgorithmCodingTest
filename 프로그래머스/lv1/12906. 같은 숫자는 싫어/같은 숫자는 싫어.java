import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        List<Integer> list = new LinkedList();
        list.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != list.get(list.size()-1)) list.add(arr[i]);
        }
        
//         answer = new int[list.size()];
        
//         for(int i = 0; i < answer.length; i++){
//             if(i != i-1) answer[i] = list.get(i);
//         }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return list.stream().mapToInt(i -> i).toArray();
    }
}