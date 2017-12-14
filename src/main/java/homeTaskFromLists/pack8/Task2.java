package homeTaskFromLists.pack8;

/**
 * Tasks from lists, page 59 (task2);
 *
 * Check recursion method.
 */
public class Task2 {

    static int n = 2;

    public static void main(String[] args) {
        int k = -20;
    printSentVariable(k);
    }

    private static void printSentVariable(int k) {
        if (k > n) {
            System.out.println(n);
            n++;
            printSentVariable(k);
        } else if (k < n) {
            System.out.println(n);
            n--;
            printSentVariable(k);
        } else {
            System.out.println("Your print is end.");
        }
    }

}
