/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.tools;
import database.Database;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author usuario
 */
public class AttendanceHandler {
    
     private Database connection;
    
    public AttendanceHandler(){
        this.connection = new Database(); //Cada vez que se instancia un studentsDAO, va a inicializar un objeto de tipo Database
    }
    
    public int convertFromString(String attendance){
        
        if(attendance.equals("Present")){
            return 1;
        }
        else if(attendance.equals("Absent")){
            return 2;
        }
        else if(attendance.equals("Justified")){
            return 3;
        }
        else{
            return 0;
        }
    }
    public String convertFromInt(int attendance){
        if(attendance == 1){
            return "Present";
        }
        else if (attendance == 2){
            return "Absent";
        }
        else if (attendance == 3){
            return "Justified";
        }
        else{
            return null;
        }
    }
    public boolean dateExists(String date){
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean exists = false;
        
        try{
            ps = connection.connect().prepareStatement("SELECT COUNT(*) FROM attendance WHERE date = ?");
            ps.setString(1,date);
            rs = ps.executeQuery();
            
            if(rs.next() && rs.getInt(1)>0){
                exists = true;
                System.out.println("Existe");
            }
            else System.out.println("No existe");
            
            connection.disconnect();
            }catch(SQLException e){
                e.printStackTrace();
                System.out.println("");
                connection.disconnect();
            }
            return exists;
    }
}