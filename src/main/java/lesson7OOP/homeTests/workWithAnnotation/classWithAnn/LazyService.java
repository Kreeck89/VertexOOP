package lesson7OOP.homeTests.workWithAnnotation.classWithAnn;

import lesson7OOP.homeTests.workWithAnnotation.annotation.Init;
import lesson7OOP.homeTests.workWithAnnotation.annotation.Service;

@Service(name = "LS")
public class LazyService {

    @Init
    public void lazyInit() throws Exception {
        System.out.println("Print text lazyService");
    }
}
