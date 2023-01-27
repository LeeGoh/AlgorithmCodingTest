class Solution {
    public int solution(String str1, String str2) {
        String str3 = str1.replaceAll(str2, "");
        if(str1.length() != str3.length()) return 1;
        else return 2;
    }
}