package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connectivity {
    private final Connection connection;
    public Connection getConnection;

    public Connectivity() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java_training_db",
                "root",
                "password"
        );
        connection.setAutoCommit(false);
        connection.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
        System.out.println("---- Connected to MySQL Successfully ----");
    }



}
