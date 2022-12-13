class Solution {
    public String solution(String[] seoul) {
        int count = 0;
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")) count = i;
        }
        String answer = String.format("김서방은 %d에 있다", count);
        return answer;
    }
}