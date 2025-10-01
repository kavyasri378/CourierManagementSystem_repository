import java.sql.*;

public class DBManager {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cdb";
        String user = "root";
        String pwd = "Kavya@2006Kavya";
        return DriverManager.getConnection(url, user, pwd);
    }
}