import java.util.*;

class Solution {
    public long solution(long n) {
        int length = (int)(Math.log10(n)+1);
        Integer[] arr = new Integer[length];
        long answer = 0;
        for(int i = 0; i < length; i++){
            arr[i] = (int)(n % 10);
            n = n / 10;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < length; i++){
            answer = answer + arr[i];
            if(i != length-1) answer = answer * 10;
        }
        return answer;
    }
}