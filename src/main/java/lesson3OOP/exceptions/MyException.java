package lesson3OOP.exceptions;

import java.io.IOException;

public class MyException extends IOException {

    @Override
    public void printStackTrace() {
        System.out.println("Excellent work!");
    }
}
