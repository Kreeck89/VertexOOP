package lesson10OOP.reflections;

public class HackeredMethod {

    private String name;
    private int age;

    public HackeredMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String printSometext() {
        return "Printed Hacked text " + name;
    }

    private int mass[] = {10, 20, 100};

    public int[] getMass() {
        return mass;
    }
}
