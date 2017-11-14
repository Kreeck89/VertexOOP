package lesson4OOP.homeWork;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TestWithLocalDate {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);

        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(formatter.format(now));

        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(formatter.format(now));

        now = now.plusDays(10).plusMonths(1).plusYears(0);
        System.out.println(now);

        LocalDate saveDate = LocalDate.of(1990, 2, 2);
        System.out.println(saveDate);

        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.toEpochMilli());
        System.out.println(instant.minusMillis(2000).plusSeconds(2));

        ZoneId zoneId = ZoneId.of("Europe/Kiev");
        ZonedDateTime timeOfKiev = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        System.out.println(timeOfKiev);

        Period period = Period.between(saveDate, now);
        System.out.println(period);
        System.out.println("Y: " + period.getYears() + " M: " + period.getMonths());
    }
}
