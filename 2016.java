import java.time.*;
import java.time.format.*;
import java.util.*; //Locale

class Solution {
    public String solution(int a, int b) {
        
        return DateUtil.getDayOfWeek(2016,a,b);
    }
    
    public static class DateUtil{
        public final static DateTimeFormatter dayOfWeekFormat = DateTimeFormatter.ofPattern("EEE").withLocale(Locale.ENGLISH);
        
        public static String getDayOfWeek(int year, int month, int day){
            return LocalDate.of(year,month,day).format(dayOfWeekFormat).toUpperCase();
        }
    }
}
