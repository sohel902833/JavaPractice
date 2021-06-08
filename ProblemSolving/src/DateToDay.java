import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateToDay {
    public static String findDay(int month, int day, int year) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        return new DateFormatSymbols().getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase();
    }
    public static void main(String[] args) {

        try {
            System.out.println(findDay(10,02,2002));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
