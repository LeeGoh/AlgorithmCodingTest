class Solution {
    boolean solution(String s) {
        
        s = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p') pCount++;
            else if(s.charAt(i) == 'y') yCount++;
        }
        if(pCount == yCount) return true;
        else return false;
    }
}