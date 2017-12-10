package lesson10OOP;

public class Fibonacci {

    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public long f(int k, int fib1, int fib2) {
        if (k > 2) {
            return f(k - 1, fib2, fib2 + fib1);
        } else {
            return fib2;
        }
    }

    public long fib(int n) {
        return f(n, 1, 1);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacci(10));

        System.out.println(fibonacci.fib(10));

    }
}
