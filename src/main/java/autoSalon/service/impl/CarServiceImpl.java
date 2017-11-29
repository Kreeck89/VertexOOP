package autoSalon.service.impl;

import autoSalon.dao.CarDAO;
import autoSalon.dao.factory.DAOFactory;
import autoSalon.model.Car;
import autoSalon.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getAllCars() {
        CarDAO allCarMethods = DAOFactory.getAllCarMethods();
        return allCarMethods.getAllCars();
    }

    @Override
    public void addPassenger(int human, Car car) {
        if (car != null) {
            DAOFactory.getAllCarMethods().addPassenger(human, car);
        }
    }

    @Override
    public void startCar(Car car) {
        if (car != null) {
            DAOFactory.getAllCarMethods().startCar(car);
        }
    }

    @Override
    public void stopCar(Car car) {
        if (car != null) {
            DAOFactory.getAllCarMethods().stopCar(car);
        }
    }

    @Override
    public void moveCar(Car car) {
        if (car != null) {
            DAOFactory.getAllCarMethods().moveCar(car);
        }
    }
}
