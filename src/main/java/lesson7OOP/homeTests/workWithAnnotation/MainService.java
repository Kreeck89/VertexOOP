package lesson7OOP.homeTests.workWithAnnotation;

import lesson7OOP.homeTests.workWithAnnotation.annotation.Service;
import lesson7OOP.homeTests.workWithAnnotation.classWithAnn.LazyService;
import lesson7OOP.homeTests.workWithAnnotation.classWithAnn.SimpleService;

public class MainService {

    public static void main(String[] args) {
        ispectService(SimpleService.class);
        ispectService(LazyService.class);
        ispectService(String.class);
    }

    static void ispectService(Class<?> service) {
        if (service.isAnnotationPresent(Service.class)) {
            Service sv = service.getAnnotation(Service.class);
            System.out.println(sv.name());
        } else {
            System.out.println("Empty");
        }
    }
}
