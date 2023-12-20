package models;

import java.util.List;

public class User {

    private int id;
    private String name;
    private List<Car> cars;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public User(int id, String name, List<Car> cars) {
        this.id = id;
        this.name = name;
        this.cars = cars;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    public void addCar(Car car) {
        cars.add(car);
    }
}
