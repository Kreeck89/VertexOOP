package lesson6OOP.Work1.Military;

import lesson6OOP.Work1.Texts.Print1;
import lesson6OOP.Work1.Texts.Print2;
import lesson6OOP.Work1.Texts.Print3;

public class MilitaryService {

    public static void main(String[] args) {

        Military print1 = new Print1();
        print1.serve();

        Military print2 = new Print2();
        print2.serve();

        Military print3 = new Print3();
        print3.serve();
        print3.otherService();
    }
}
