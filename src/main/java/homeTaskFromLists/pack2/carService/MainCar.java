package homeTaskFromLists.pack2.carService;

import homeTaskFromLists.pack2.model.Car;

import java.util.Random;

/**
 * Task from list, page 13 (task 1-4).
 *
 * Different testing with Car methods by tasks from papers.
 */
public class MainCar {

    public static void main(String[] args) {
        Random random = new Random();


        Car car1 = new Car();
        Car car2 = new Car();
        car1.setNumber("AA7788VI");
        car1.setColor("Black");
        car2.setNumber("AA1111GI");
        car2.setColor("Red");

        car1.printAboutMe();
        car2.printAboutMe();

        for (int i = 0; i < 10; i++) {
            int n = -5 + random.nextInt(10);
            car1.addPassenger(n);
            int m = -5 + random.nextInt(10);
            car2.addPassenger(m);
        }
        car1.printAboutMe();
        car2.printAboutMe();

        car1.setCarState(Car.CarsState.STOP);
        car1.startCar();
        System.out.println(car1.getCarState());
        car1.moveCar();
        System.out.println(car1.getCarState());
        car1.stopCar();
        System.out.println(car1.getCarState());

    }


}
