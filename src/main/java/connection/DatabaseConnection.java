package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/servlet";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Properties props = new Properties();
            props.setProperty("user", DB_USERNAME);
            props.setProperty("password", DB_PASSWORD);
            connection = DriverManager.getConnection(DB_URL, props);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return connection;
    }
}