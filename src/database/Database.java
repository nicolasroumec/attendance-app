
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public static Connection connect() {
        Connection dbconnection = null;
        try {
            String url = "jdbc:sqlite:studentDb.db"; 
            dbconnection = DriverManager.getConnection(url);
            System.out.println("Conexion exitosa.");
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return dbconnection;
    }
}

