import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int week = dayOfWeek.getValue();
        
        if(week == 1) answer = "MON";
        else if(week == 2) answer = "TUE";
        else if(week == 3) answer = "WED";
        else if(week == 4) answer = "THU";
        else if(week == 5) answer = "FRI";
        else if(week == 6) answer = "SAT";
        else answer = "SUN";
        return answer;
    }
}