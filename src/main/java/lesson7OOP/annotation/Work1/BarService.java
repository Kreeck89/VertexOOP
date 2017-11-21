package lesson7OOP.annotation.Work1;

import java.lang.reflect.Method;

public class BarService {

    public static void main(String[] args) throws NoSuchMethodException {

        Miracle miracle = new Miracle();
        Class<? extends Miracle> clazz = miracle.getClass();

        Method method = clazz.getDeclaredMethod("print");
        Default annotation = method.getAnnotation(Default.class);
        int age = annotation.age();
        String name = annotation.name();
        System.out.println(name);
        System.out.println(age);
    }
}
