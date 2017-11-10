package lesson3OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Work2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number only: ");
        int num = 0;
        try {
            num = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.close();
            System.err.println("Don`t worry only");
        }
        System.out.println("Yuor numbers is: " + num);

    }
}
