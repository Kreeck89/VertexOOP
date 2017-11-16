package lesson6OOP.Work3.service;

import lesson6OOP.Work3.util.Car;
import lesson6OOP.Work3.util.CarType;
import lesson6OOP.Work3.typeOfCars.Honda;
import lesson6OOP.Work3.typeOfCars.Mazda;

public class Service {

    public static void main(String[] args) {

        Car car = whatCar(CarType.MAZDA);
        car.drive();
    }

    public static Car whatCar(CarType type) {
        if (type == CarType.HONDA) {
            return new Honda();
        } else if (type == CarType.MAZDA) {
            return new Mazda();
        }
        return null;
    }
}
