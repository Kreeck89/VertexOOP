package lesson4OOP.homeWork;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.WEEK_OF_MONTH;

public class TestWithDataCalendar {

    public static void main(String[] args) throws ParseException {
        Date moment = new Date();
        System.out.println(moment);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(moment);
        calendar.add(WEEK_OF_MONTH, 1);
        System.out.println(calendar.getTime());

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        Date newDate = simpleDateFormat.parse("12/2/1989");
        System.out.println(newDate); //throws ParseException
    }
}
