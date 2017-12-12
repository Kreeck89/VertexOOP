package lesson10OOP.reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HackService {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        HackeredMethod hackeredMethod = new HackeredMethod("Igor", 29);
        Class<? extends HackeredMethod> clazz = hackeredMethod.getClass();
        Method printSometext = clazz.getDeclaredMethod("printSometext");
        printSometext.setAccessible(true);
        Object invoke = printSometext.invoke(hackeredMethod);
        final String fullName;

        if (invoke instanceof String) {
            fullName = (String) invoke;
        } else {
            fullName = "unknown";
        }
        System.out.println(fullName);
    }
}
