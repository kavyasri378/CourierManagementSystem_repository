import java.sql.*;

public class DBManager {
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load the MySQL driver
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC Driver not found", e);
        }
        // detail to connect
        String url = "jdbc:mysql://localhost:3306/cdb?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String pwd = "Kavya@2006Kavya";
        return DriverManager.getConnection(url, user, pwd);
    }
}