package homeTaskFromLists.pack8;

/**
 * Tasks from lists, page 59 (task3);
 *
 * Factorial with recursions.
 */
public class FactorialN {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorial(n));

    }

    private static int factorial(int n) {
        int res;
        if (n <= 1) {
            return 1;
        } else {
            res = n * factorial(n - 1);
        }
        return res;
    }
}
