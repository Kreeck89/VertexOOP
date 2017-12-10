package hack;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class Hacker {

    public static void main(String[] args) {

        Victim victim = new Victim();
        Class<? extends Victim> clazz = victim.getClass();
        ArrayList<String> methodsList = new ArrayList<>();

        Method[] declaredMethods = clazz.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            methodsList.add("Method getName() " + declaredMethod.getName() + "\n");
            methodsList.add("Method getModifiers() " + String.valueOf(declaredMethod.getModifiers()) + "\n");
            methodsList.add("Method getParameterCount() " + String.valueOf(declaredMethod.getParameterCount()) + "\n");
        }

        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            methodsList.add("Field getName() " + declaredField.getName() + "\n");
            methodsList.add("Field getModifiers() " + String.valueOf(declaredField.getModifiers()) + "\n");
        }

        Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();
        for (Annotation declaredAnnotation : declaredAnnotations) {
            methodsList.add(declaredAnnotation.annotationType().getSimpleName());
        }
        System.out.println(methodsList.toString());
    }
}
