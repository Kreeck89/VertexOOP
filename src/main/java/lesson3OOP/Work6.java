package lesson3OOP;

import java.util.Scanner;

public class Work6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter smth.");
        int num = 0;
        try {
            num = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("You have a mistake.");
        } finally {
            scanner.close();
        }
        System.out.println(num);
    }
}
