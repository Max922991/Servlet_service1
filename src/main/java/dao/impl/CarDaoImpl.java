package dao.impl;

import connection.DatabaseConnection;
import dao.CarDao;
import dao.UserDao;
import models.Car;
import models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private final Connection connection;

    public CarDaoImpl() {
        try {
            this.connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException("Failed to establish database connection", e);
        }
    }

    @Override
    public Car getCarById(int id) {
        Car car = null;
        String query = "SELECT * FROM cars WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                car = mapCar(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return car;
    }

    @Override
    public List<Car> getCarsByUserId(int userId) {
        List<Car> cars = new ArrayList<>();
        String query = "SELECT * FROM cars WHERE user_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Car car = mapCar(resultSet);
                cars.add(car);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }

    @Override
    public void addCar(Car car) {
        String query = "INSERT INTO cars (brand, model, user_id) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, car.getBrand());
            statement.setString(2, car.getModel());
            statement.setInt(3, car.getUser().getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateCar(Car car) {
        String query = "UPDATE cars SET brand = ?, model = ?, user_id = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, car.getBrand());
            statement.setString(2, car.getModel());
            statement.setInt(3, car.getUser().getId());
            statement.setInt(4, car.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteCar(Car car) {
        String query = "DELETE FROM cars WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, car.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Car mapCar(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String brand = resultSet.getString("brand");
        String model = resultSet.getString("model");
        int userId = resultSet.getInt("user_id");
        UserDao userDao = new UserDaoImpl();
        User user = userDao.getUserById(userId);
        return new Car(id, brand, model, user);
    }
}