import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        Map<String, Integer> xMap = new HashMap();
        Map<String, Integer> yMap = new HashMap();

        List<String> list = new ArrayList<String>();

        for(String key: X.split("")) {
            xMap.put(key, xMap.getOrDefault(key, 0)+1);
        }
        
        for(String key: Y.split("")) {
            yMap.put(key, yMap.getOrDefault(key, 0)+1);
        }
        
        for(String key: xMap.keySet()) {
            if(!yMap.containsKey(key)) continue;
            
            int length = Math.min(xMap.get(key), yMap.get(key));
            for(int i = 0; i < length; i++) {
                list.add(key);
            }
        }
        
        answer = list.stream()
            .sorted(Collections.reverseOrder())
            .collect(Collectors.joining());
        
        if(answer.isEmpty()) return "-1";
        if(answer.replaceAll("0", "").isEmpty()) return "0";
        return answer;
        
        // List<Character> xList = new ArrayList<Character>();
        // List<Character> yList = new ArrayList<Character>();
        // StringBuffer xBuffer = new StringBuffer();
        // StringBuffer yBuffer = new StringBuffer();
        // List<Character> list = new ArrayList<Character>();
        
        // for(int i = 0; i < X.length(); i++){
        //     xList.add(X.charAt(i));
        // }
        
        // for(int i = 0; i < Y.length(); i++){
        //     yList.add(Y.charAt(i));
        // }
        
        // xBuffer.append(X);
        // yBuffer.append(Y);
        
        // int count = 0;
        // for(int i = 0; i < xList.size(); i++){
        //     for(int j = 0; j < yList.size(); j++){
        //         if(xList.get(i) == yList.get(j)) {
        //             list.add(xList.get(i));
        //             if(xList.get(i) == '0') count++;
        //             xList.set(i, 'x');
        //             yList.set(j, 'y');
        //         }
        //     }
        // }
        
        // for(int i = 0; i < X.length(); i++){
        //     for(int j = 0; j < Y.length(); j++){
        //         if(xBuffer.charAt(i) == yBuffer.charAt(j)) {
        //             list.add(xBuffer.charAt(i));
        //             yBuffer.setCharAt(j, 'y');
        //             xBuffer.setCharAt(i, 'x');
        //         }
        //     }
        // }
        
        // if(list.size() == 0) return "-1";
        // if(list.get(0) == '0') return "0";
        
        // Collections.sort(list, Collections.reverseOrder());
        
        // for(Character str : list){
        //     answer += str;
        // }   
        // answer = list.toString();
        // answer = answer.replace("[", "");
        // answer = answer.replace("]", "");
        // answer = answer.replace(",", "");
        // answer = answer.replace(" ", "");
        
        // return answer;
    }
}