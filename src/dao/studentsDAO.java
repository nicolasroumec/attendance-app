
package dao;

import database.Database;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.Student;
import models.StudentDTO;

public class StudentsDAO {
    private Database connection;
    
    public StudentsDAO(){
        this.connection = new Database(); //Cada vez que se instancia un studentsDAO, va a inicializar un objeto de tipo Database
    }
    
    public boolean addStudent (StudentDTO student){
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
    
    public boolean updateStudent (StudentDTO student){
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
    
    public ArrayList<StudentDTO> getStudent(){
        ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
        PreparedStatement ps = null;
        ResultSet rs = null; //Puntero o cursor que permite navegar a través de las filas de datos de la base de datos después de ejecutar un SELECT.
        try{
            ps = connection.connect().prepareStatement("SELECT * FROM student");
            rs = ps.executeQuery();
            
            while(rs.next()){
                StudentDTO student = new StudentDTO(
                rs.getString("firstName"),
                rs.getString("lastName"),
                rs.getInt("dni")
                );
                list.add(student); 
            }
            
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;    
    }
    
    private void testStudent(Student student){
        System.out.println("Nombre: " + student.getFirstName());
                System.out.println("Apellido: " + student.getLastName());
                System.out.println("DNI: " + student.getDni());
                System.out.println();
    }
    public void testStudent(ArrayList<Student> students){
        for(Student student : students){
            this.testStudent(student);
        }
    }
}
