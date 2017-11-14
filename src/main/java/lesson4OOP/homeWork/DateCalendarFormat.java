package lesson4OOP.homeWork;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateCalendarFormat {

    public static void main(String[] args) {

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.getTime());

        DateFormat dateFormat = DateFormat.getDateInstance();
        dateFormat.format(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));

        Date dateForTest;
        dateForTest = getLongFromDate();
        System.out.println(dateForTest);
        calendar.setTime(dateForTest);
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println(calendar.getTime());

        calendar.add(Calendar.YEAR, 10);
        System.out.println(calendar.getTime());

        calendar.set(2015, 6, 3);
        System.out.println(dateFormat.format(calendar.getTime()));
    }

    /**
     * Enter some date in const format and return standard date.
     */
    private static Date getLongFromDate() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Enter your birthday in format: MM/dd/yyyy");
        Date yourDate = new Date();
        try {
            String yourDay = scanner.nextLine();
            yourDate = dateFormat.parse(yourDay);
        } catch (ParseException e) {
            System.out.println("You entered wrong number!");
        } finally {
            scanner.close();
        }
        return yourDate;
    }
}
