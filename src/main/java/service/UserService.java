package service;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Igor Hnes on 10/19/17.
 */
public class UserService {

    private static final String PASSWORD = "linux";

    public static void main(String[] args) {

        final String userPass = getPass();

        final Class<SecretService> clazz = SecretService.class;
        final Method[] methods = clazz.getDeclaredMethods();
        if (userPass.equals(PASSWORD)) {
            printPrivate(methods);
            printPublic(methods);
        } else {
            printPublic(methods);
        }
    }

    private static void printPrivate(Method[] methods) {
        for (Method method : methods) {
            if (Modifier.isPrivate(method.getModifiers())) {
                System.out.println(method.getName());
            }
        }
    }

    private static void printPublic(Method[] methods) {
        for (Method method : methods) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println(method.getName());
            }
        }
    }

    private static String getPass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you password");
        final String pass = scanner.nextLine();
        scanner.close();

        return pass;
    }
}
