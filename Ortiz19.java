
//171
import java.util.Calendar;

public class Ortiz19 {

    public static void main(String[] args) {
        int sundayCount = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.set(1900, Calendar.FEBRUARY, 1);
        for (int year = 1901; year <= 2000; year++) {
            for (int month = Calendar.JANUARY; month <= Calendar.DECEMBER; month++) {
                calendar.set(year, month, 1);
                if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                    sundayCount++;
                }
            }
        }
        System.out.println(sundayCount);
    }
}