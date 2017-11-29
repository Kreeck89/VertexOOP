package autoSalon.dao;

import autoSalon.model.Car;

import java.util.List;

/**
 * gaeAllCars() - returned all instances of Car from Database;
 * addPassenger() - Adds passengers to car and check in range -5 to 5;
 * startCar() - Starts car if did not start early and don`t move;
 * moveCar() - Starts move car if was started early and don`t moves now;
 * stopCar() - Stop car if it moves now. And it`s engine will off;
 *
 * Have some features to move with attached track!
 */
public interface CarDAO {

    List<Car> getAllCars();
    void addPassenger(int human, Car car);
    void startCar(Car car);
    void stopCar(Car car);
    void moveCar(Car car);
}
