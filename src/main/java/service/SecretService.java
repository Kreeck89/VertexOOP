package service;

import java.util.Scanner;

/**
 * @author Igor Hnes on 10/19/17.
 */
public class SecretService {

    public void swim() {
        System.out.println("I swim 100m");
    }

    public void training() {
        System.out.println("I training 1 hours");
    }

    public int myAge() {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        scanner.close();
        return age;
    }

    public String yourName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        return name;
    }

    public int yourHight() {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        scanner.close();
        return h;
    }
}
