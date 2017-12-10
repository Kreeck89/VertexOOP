package lesson10OOP;

import java.util.HashMap;
import java.util.Map;

public class HomeTest {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1111);
        map.put("Two", 2222);
        map.put("Three", 33);
        System.out.println(map);
        for (Map.Entry<String, Integer> elem : map.entrySet()) {
            System.out.println("Key is: " + elem.getKey() + " and Value is: " + elem.getValue());
        }
        System.out.println(map);

        System.out.println(Fib(20));

        System.out.println(Fibon(20, 1, 1));


    }

    private static long Fib(int n) {
        if (n >= 2) {
            return Fib(n - 1) + Fib(n - 2);
        }
        return 1;
    }

    private static long Fibon(int n, int fib1, int fib2) {
        if (n >= 2) {
            return Fibon(n - 1, fib2, fib2 + fib1);
        }
        return fib2;
    }
}
