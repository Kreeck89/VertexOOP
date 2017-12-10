package lesson10OOP.Generics;

import lesson10OOP.Generics.fruits.Apple;
import lesson10OOP.Generics.fruits.Fruit;
import lesson10OOP.Generics.fruits.Mekintosh;
import lesson10OOP.Generics.fruits.Pineapple;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Juicer<T extends Object & Fruit> {

    public void makeJuice(T fruit) {
        System.out.println(fruit.squeeze());
    }

    public void makeJuice(List<T> fruits) {
        fruits.forEach(fruit ->
                System.out.println(fruit.squeeze()));
    }

    public static void main(String[] args) {

        Juicer<Apple> appleJuicer = new Juicer<>();
        appleJuicer.makeJuice(new Apple());
        appleJuicer.makeJuice(new Mekintosh());
//        appleJuicer.makeJuice(new Pineapple());  НЕЗЯ ТАК ДЕЛАТЬ!

//        appleJuicer.makeJuice(new ArrayList<Mekintosh>());   И ТАК ДЕЛАТЬ НЕЗЯ! НО ЕСТЬ РЕШЕНИЕ....


        Mekintosh mekintosh = new Mekintosh();
    }
}
