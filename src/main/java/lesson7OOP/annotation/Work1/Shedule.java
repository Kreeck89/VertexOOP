package lesson7OOP.annotation.Work1;

public @interface Shedule {

    String reason() default "Just";
    String when() default  "Here";
}
