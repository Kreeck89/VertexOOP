package lesson10OOP.Comparable;

import java.util.Comparator;

public class MyComparatorForAnimals implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        Integer a = (Integer) o1.weight;
        Integer b = (Integer) o2.weight;
        return a.compareTo(b);
    }
}
