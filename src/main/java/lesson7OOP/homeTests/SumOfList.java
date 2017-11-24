package lesson7OOP.homeTests;

import java.util.ArrayList;
import java.util.List;

public class SumOfList {

    public static void main(String[] args) {
        final List<String> doubleValues = new ArrayList<>();
        double value = 0.0;
        doubleValues.add("5.01");
        doubleValues.add("0.002");
        doubleValues.add("0.00024");
        doubleValues.add("0.000022");

        for (String elem : doubleValues) {
            value += Double.valueOf(elem);
        }
        System.out.printf("%.10f", value); // Formatting in print
        System.out.println();

        System.out.println(String.format("%.10f", value)); // Print with String formatting

        double v = Double.parseDouble(String.valueOf(value)); //convert decimal number to double for print or calc
        System.out.println(v);
    }
}
