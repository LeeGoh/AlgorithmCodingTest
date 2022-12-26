class Solution {
    public String solution(int[] food) {
        String answer = "";
        String back = "";
        int sum = 1;
        int[] even = new int[food.length];
        even[0] = 1;
        for(int i = 1; i < food.length; i++){
            if(food[i] % 2 == 0) even[i] = food[i];
            else even[i] = food[i]-1;
            
            for(int j = 0; j < even[i]/2; j++){
                answer += Integer.toString(i);
                back += Integer.toString(i);
            }
        }
        
        answer += "0";
        
        for(int i = back.length()-1; i >= 0; i--){
            answer += back.charAt(i);
        }
        
        return answer;
    }
}