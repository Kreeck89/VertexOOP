package lesson3OOP;

import java.util.Arrays;

public class Work4 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[10] = 12;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You array length is not so long.");
        }

        System.out.println(Arrays.toString(arr));
    }
}
