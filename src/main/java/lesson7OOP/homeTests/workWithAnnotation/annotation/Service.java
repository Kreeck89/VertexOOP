package lesson7OOP.homeTests.workWithAnnotation.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Service {

    String name();

    boolean lazyLoad() default false;
}
