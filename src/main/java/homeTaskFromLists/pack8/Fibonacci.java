package homeTaskFromLists.pack8;

/**
 * Tasks from lists, page 59 (task4);
 *
 * Found Fibonacci variable;
 * Work with recursion.
 */
public class Fibonacci {

    public static void main(String[] args) {
        int foundValue = 10;
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacci(foundValue));

    }

    private long fibonacci(int n) {
        return fib(n, 1, 1);
    }

    private long fib(int n, int fib1, int fib2) {
        if (n > 2) {
            return fib(n - 1, fib2, fib2 + fib1);
        } else {
            return fib2;
        }
    }
}
