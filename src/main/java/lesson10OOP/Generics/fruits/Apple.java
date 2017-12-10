package lesson10OOP.Generics.fruits;

import lesson10OOP.Generics.compare.AppleSweetnessComparator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apple implements Fruit, Comparable<Apple> {

    private double weight;
    private double sweetness;

    @Override
    public String squeeze() {
        return "Apple juice";
    }

    @Override
    public int compareTo(Apple other) {
        return this.weight > other.weight ? 1 : this.weight == other.weight ? 0 : -1;
    }

    public static void main(String[] args) {
        Apple apple1 = new Apple(1.2, 3.0);
        Apple apple2 = new Apple(10.2, 1.0);
        Apple apple3 = new Apple(233.2, 15.0);
        Apple apple4 = new Apple(21.2, 30.0);

        List<Apple> apples = Arrays.asList(apple1, apple2, apple3, apple4);
        System.out.println(apples);

        Collections.sort(apples);
        System.out.println(apples);

        Collections.sort(apples, new AppleSweetnessComparator().reversed());
        System.out.println(apples);
    }
}
