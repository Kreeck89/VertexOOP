package lesson4OOP;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Work2 {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        LocalDate minusWeeks = now.minusWeeks(1);

        System.out.println(minusWeeks);
        System.out.println(now.isAfter(minusWeeks));


        while (true) {
            LocalDateTime time = LocalDateTime.now();
            System.out.println(time.getDayOfWeek()
        + " "
        + time.getHour()
        + " "
        + time.getMinute()
        + " "
        + time.getSecond());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
