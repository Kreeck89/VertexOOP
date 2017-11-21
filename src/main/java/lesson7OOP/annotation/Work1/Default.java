package lesson7OOP.annotation.Work1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Default {

    String name() default "NoName";
    int age() default 12;
}
