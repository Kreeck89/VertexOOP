package autoSalon.service;

import autoSalon.model.Car;

import java.util.List;

/**
 * All methods described in CarDAO.
 */
public interface CarService {

    List<Car> getAllCars();
    void addPassenger(int human, Car car);
    void startCar(Car car);
    void stopCar(Car car);
    void moveCar(Car car);
}
