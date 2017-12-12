package lesson10OOP.Comparable;

import java.util.Set;
import java.util.TreeSet;

public class AnimalMain {

    public static void main(String[] args) {

        Animal animal3 = new Animal("Bear", 5);
        Animal animal1 = new Animal("Tiger", 25);
        Animal animal2 = new Animal("Tiger", 32);

        MyComparatorForAnimals myComparatorForAnimals = new MyComparatorForAnimals();
        MySeconComparator mySeconComparator = new MySeconComparator();

        Set<Animal> animalSet = new TreeSet<>(myComparatorForAnimals.thenComparing(mySeconComparator));
        animalSet.add(animal1);
        animalSet.add(animal2);
        animalSet.add(animal3);

        for (Animal animal : animalSet) {
            System.out.println(animal.getType());
        }


    }
}
