package lesson6OOP.HomeWork;

public class SeviceEnum {

    public static void main(String[] args) {

        EnumEnimals [] enimals = EnumEnimals.values();

        for (EnumEnimals elem : enimals) {
            System.out.println(elem);
        }

        System.out.println("Elephant weight is: " + EnumEnimals.ELEPHANT.getWeight());

        for (EnumEnimals elem : enimals) {
            System.out.println(elem + " weight is: " + elem.getWeight());
        }

        for (EnumEnimals element : enimals) {
            System.out.println(element + " ordinary is: " + element.ordinal());
        }
    }
}
