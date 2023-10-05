
package dao;

import database.Database;
import models.Student;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentsDAO {
    private Database connection;
    
    public StudentsDAO(){
        this.connection = new Database(); //Cada vez que se instancia un studentsDAO, va a inicializar un objeto de tipo Database
    }
    
    public boolean addStudent (Student student){
        PreparedStatement ps = null; //Query
        try{
            ps = connection.connect().prepareStatement("INSERT INTO student VALUES(null,?,?,?)");
            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setInt(3, student.getDni());
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            e.printStackTrace(); //Imprime datos del error
            return false;
        }
    }
    
    public boolean deleteStudent (int dni){
        PreparedStatement ps = null;
        try{
            ps = connection.connect().prepareStatement("DELETE FROM student WHERE dni=?");
            ps.setInt(1, dni);
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            e.printStackTrace(); 
            return false;
        }
    }
    
    public boolean updateStudent (Student student){
        PreparedStatement ps = null;
        try{
            ps = connection.connect().prepareStatement("UPDATE student SET firstName=?, lastName=? WHERE dni=?");
            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setInt(3, student.getDni());
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            e.printStackTrace(); 
            return false;
        }
    }
}
