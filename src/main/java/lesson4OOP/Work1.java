package lesson4OOP;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Work1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate satrtOOP = LocalDate.of(2017, Month.FEBRUARY, 31);

        long days = ChronoUnit.DAYS.between(satrtOOP, now);
        System.out.println(days);

        System.out.println("Enter your year:");
        int year = scanner.nextInt();
        System.out.println("Enter mouth:");
        int mounth = scanner.nextInt();
        System.out.println("Enter day: ");
        int day = scanner.nextInt();

        LocalDate daysBourn = LocalDate.of(year, mounth, day);
        long howManyDays = ChronoUnit.DAYS.between(daysBourn, now);
        System.out.println(howManyDays);


    }
}
