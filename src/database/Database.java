
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private Connection dbconnection = null;
    public Connection connect() {
        try {
            String url = "jdbc:sqlite:studentDb.db"; 
            dbconnection = DriverManager.getConnection(url);
            System.out.println("Conexion exitosa.");
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return dbconnection;
    }
    
    public void disconnect(){
        try{
            dbconnection.close();
            System.out.println("Connection closed.");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

