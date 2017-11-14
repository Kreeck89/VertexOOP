package lesson5OOP.Work1.files;

import lesson5OOP.Work1.WriteYourText;
import lesson5OOP.Work1.WriteYourTextImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        WriteYourText seveText = new WriteYourTextImpl();
        int n = 0;
        String s = "";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Your text:");
            s = scanner.nextLine();
            System.out.println("Enter what file you want save: 1/2/3/4:");
            n = scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        switch (n) {
            case 1:
                seveText.writeToFile1(s);
                break;
            case 2:
                seveText.writeToFile2(s);
                break;
            case 3:
                seveText.writeToFile3(s);
                break;
            case 4:
                seveText.writeToFile4(s);
                break;
                default:
                    System.out.println("You entered wrong number!");
                    break;
        }
    }
}
