package lesson3OOP;

import java.util.Scanner;

public class Work3 {

    public static void main(String[] args) {

        try {
             spectr();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Sorry, you are mistake!");
        }
    }

    private static void spectr() throws ArrayIndexOutOfBoundsException {
        int[] mas = new int[2];
        mas[4] = 2;
        System.out.println(mas);
    }
}
