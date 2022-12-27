import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        char[] ch = new char[strings.length];
        
        Arrays.sort(strings);
        
        for(int i = 0; i < answer.length; i++){
            ch[i] = strings[i].charAt(n);
        }
        
        Arrays.sort(ch);
        
        List<String> list = new LinkedList(Arrays.asList(strings));
        for(int i = 0; i < ch.length; i++){
            for(int j = 0; j < list.size(); j++){
                if(list.get(j).charAt(n) == ch[i]){
                    answer[i] = list.get(j);
                    list.remove(j);
                    break;
                }
            }
        }
        return answer;
    }
}