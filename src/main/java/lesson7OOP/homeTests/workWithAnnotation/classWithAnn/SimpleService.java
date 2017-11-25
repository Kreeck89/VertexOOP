package lesson7OOP.homeTests.workWithAnnotation.classWithAnn;

import lesson7OOP.homeTests.workWithAnnotation.annotation.Init;
import lesson7OOP.homeTests.workWithAnnotation.annotation.Service;

@Service(name = "SS")
public class SimpleService {

    @Init
    public void initService() {
        System.out.println("Print text initService");
    }

    public void doNotWork() {
        System.out.println("Dont print this text");
    }
}
