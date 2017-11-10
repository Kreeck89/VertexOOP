package lesson3OOP;

import lesson3OOP.exceptions.MyException;

public class Work8extends {

    public static void main(String[] args) {

        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
