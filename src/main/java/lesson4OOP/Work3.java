package lesson4OOP;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Work3 {

    public static void main(String[] args) {

        List<LocalDate> dataList = new LinkedList<>();
        List<LocalDate> newDateList = new LinkedList<>();
        LocalDate now = LocalDate.now();
        LocalDate firstDay = now.minusWeeks(1);

        for (int i = 0; i < 14; i++) {
            dataList.add(firstDay);
            firstDay = firstDay.plusDays(1);
        }

        for (LocalDate elem : dataList) {
            System.out.println(elem);
        }

        LocalDate now2 = LocalDate.now();
        LocalDate from = now2.minusWeeks(1);
        LocalDate to = now2.plusWeeks(1);

        int limit = to.getDayOfMonth() - from.getDayOfMonth();

        System.out.println(limit);

        for (int i = 0; i <= limit; i++) {
            newDateList.add(from.plusDays(i));
        }
        System.out.println(newDateList);
    }
}
