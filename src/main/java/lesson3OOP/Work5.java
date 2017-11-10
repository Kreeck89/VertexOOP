package lesson3OOP;

import java.util.Scanner;

public class Work5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alex = "Alex";
        System.out.println("Some test: ");
        String yourName = scanner.nextLine();

        if (yourName.equals(alex)) {
            System.out.println("It`s your name.");
        }

        yourName = null;
        try {
            if(yourName.equals(alex)){
                System.out.println("It`s your second name.");
            }
        } catch (NullPointerException e) {
            System.out.println("Your name is null.");
        } finally {
            scanner.close();
        }

    }
}
