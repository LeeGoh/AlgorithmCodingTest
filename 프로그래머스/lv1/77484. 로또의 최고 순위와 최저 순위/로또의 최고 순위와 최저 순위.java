class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int lowest = 0;
        int highest = 0;
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] != 0) {
                for(int j = 0; j < win_nums.length; j++){
                    if(lottos[i] == win_nums[j]) {
                        highest++;
                        lowest++;
                    }
                }
            } else {
                lowest += 1;
            }
        }
        
        if(lowest == 6) lowest = 1;
        else if(lowest == 5) lowest = 2;
        else if(lowest == 4) lowest = 3;
        else if(lowest == 3) lowest = 4;
        else if(lowest == 2) lowest = 5;
        else lowest = 6;
        
        if(highest == 6) highest = 1;
        else if(highest == 5) highest = 2;
        else if(highest == 4) highest = 3;
        else if(highest == 3) highest = 4;
        else if(highest == 2) highest = 5;
        else highest = 6;
        
        answer[0] = lowest;
        answer[1] = highest;
        
        return answer;
    }
}