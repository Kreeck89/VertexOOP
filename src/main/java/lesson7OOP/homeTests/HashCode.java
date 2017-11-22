package lesson7OOP.homeTests;

public class HashCode {

    public static void main(String[] args) {
        Object ob = new Object();
        int hCode = ob.hashCode();
        System.out.println(hCode);
        int hCode2 = ob.hashCode();
        System.out.println(hCode2);

        Object bj = new Object();
        int newHCode = bj.hashCode();
        System.out.println(newHCode);

        String s1 = "Hello";
        String s2 = "Hello";
        int i1 = s1.hashCode();
        int i2 = s2.hashCode();

        System.out.println(i1);
        System.out.println(i2);

        BlackBox box1 = new BlackBox(20, 100);
        BlackBox box2 = new BlackBox(20, 100);

        System.out.println(box1.equals(box2));


        Human7 alex = new Human7("Alex", "Brejnev", 25);
        Human7 alex2 = new Human7("Alex", "Brejnev", 25);

        System.out.println(alex.equals(alex2));
    }


    public static class BlackBox {
        int age;
        int weight;

        BlackBox(int age, int weight) {
            this.age = age;
            this.weight = weight;
        }
    }


}
