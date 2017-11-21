package lesson7OOP.annotation.Work1;

public class Solution {

    public static void main(String[] args) {

        PrintText();

    }

    @Shedule(reason = "Must work", when = "in this method")
    private static void PrintText() {

        System.out.println("Test annotation");
    }
}
