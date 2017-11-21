package lesson7OOP.annotation.Work2;

import java.lang.reflect.Method;

public class SomeClass {

    @AllowPrint
    public void newPrint() throws NoSuchMethodException {
        SomeClass clax = new SomeClass();
        Class<? extends SomeClass> clazz = clax.getClass();
        Method method = clazz.getDeclaredMethod("newPrint");
        boolean present = method.isAnnotationPresent(AllowPrint.class);
        if (present) {
            System.out.println(method.getName());
        } else {
            throw new DoNotAllowPrintException();
        }
    }

    public void dontPrint() {

    }
}
