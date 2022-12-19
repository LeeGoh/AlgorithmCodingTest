class Solution {
    public int solution(int n) {
        int answer = 0;
        String result = "";
        result = Integer.toString(n, 3);
        Character[] arr = new Character[result.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = result.charAt(result.length()-i-1);
        }
        result = "";
        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }
        answer = Integer.parseInt(result, 3);
        return answer;
    }
}