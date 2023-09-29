
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public static Connection connect() {
        Connection dbconnection = null;
        try {
            
            String url = "jdbc:sqlite:C:\\Users\\usuario\\Documents\\NetBeansProjects\\Attendance\\database"; 
            
            dbconnection = DriverManager.getConnection(url);
            System.out.println("Conexión exitosa a SQLite.");
        } catch (SQLException e) {
            System.err.println("Error de conexión a SQLite: " + e.getMessage());
        }
        return dbconnection;
    }
}

