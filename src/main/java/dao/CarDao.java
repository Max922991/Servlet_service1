package dao;

import models.Car;

import java.util.List;

public interface CarDao {
    Car getCarById(int id);
    List<Car> getCarsByUserId(int userId);
    void addCar(Car car);
    void updateCar(Car car);
    void deleteCar(Car car);
}
