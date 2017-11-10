package lesson2OOP.HomeWork.homeWorkFromLists;

import java.util.Scanner;

/**
 * Create some text, choose symbol and found it from this text.
 */
public class HomeTask4 {

    public static void main(String[] args) {
        String string = getString();
        char simb = getChar();
        System.out.println(returnIndex(string, simb));
    }

    private static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String s = scanner.nextLine();
        return s;
    }

    private static char getChar() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter 1 symbol for searching: ");
        String s = scanner2.nextLine();
        char c = s.charAt(0);
        scanner2.close();
        return c;
    }

    private static int returnIndex(String string, char simd) {
        int index = -1;
        char[] stringArr = string.toCharArray();

        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i] == simd) {
                index = i;
            }
        }
        return index;
    }
}
