import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        while(n != 0){
            answer = answer + (n % 10);
            n = n / 10;
        }

        return answer;
    }
}