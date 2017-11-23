package lesson7OOP.homeTests;

import java.util.ArrayList;
import java.util.List;

public class SumOfList {

    public static void main(String[] args) {
        final List<String> doubleValues = new ArrayList<>();
        double value = 0;
        doubleValues.add("0.0001");
        doubleValues.add("0.0002");
        doubleValues.add("0.0034");
        doubleValues.add("0.0002");

        for (String elem : doubleValues) {
            value += Double.parseDouble(elem);
        }
        System.out.println(value);
    }
}
