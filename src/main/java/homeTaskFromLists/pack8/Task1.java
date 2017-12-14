package homeTaskFromLists.pack8;

/**
 * Tasks from lists, page 59 (task1);
 *
 * Check recursion method.
 */
public class Task1 {

    public static void main(String[] args) {
        int k = 20;
        printVariable(k);
    }

    private static void printVariable(int k) {
        if (k > 2) {
            System.out.println(k);
            printVariable(k-1);
        } else if (k < 2) {
            System.out.println(k);
            printVariable(k + 1);
        } else {
            System.out.println("Your print is end.");
        }
    }
}
