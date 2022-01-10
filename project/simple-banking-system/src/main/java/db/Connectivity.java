package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connectivity { private final Connection connection;

    public Connectivity() throws SQLException {


        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/week1_case_study_db",
                "root",
                "password"
        ); // trying to make a connectivity

        connection.setAutoCommit(false); // enabling txn management
        System.out.println("---- Connected to MySQL Successfully ----");
    }

    public Connection getConnection() {
        return connection;
    }
}
