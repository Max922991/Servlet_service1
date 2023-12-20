package models;

public class Car {
    private int id;
    private String brand;
    private String model;
    private User user;

    public Car(int id, String brand, String model, User user) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.user = user;
    }

    public Car() {
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public User getUser() {
        return user;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
