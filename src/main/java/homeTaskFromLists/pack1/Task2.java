package homeTaskFromLists.pack1;

import java.util.Scanner;

/**
 * Task from list, page 9 (Task4).
 *
 * enterString() - for enter testing text;
 * enterCharForSearch() - Enter symbol for search(If entered text - will takes with ind=0);
 * returnFoundedIndex() - Counts how many this symbols in your text.
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = enterString();
        char simb = enterCharForSearch();
        System.out.println(returnFoundedIndex(text, simb));
        scanner.close();
    }

    private static String enterString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Some text for check:");
        return scanner.nextLine();
    }

    private static char enterCharForSearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter char-element for search in some text:");
        char c = scanner.nextLine().charAt(0);
        return c;
    }

    private static int returnFoundedIndex(String text, char simb) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == simb) {
                counter++;
            }
        }
        return counter;
    }
}
