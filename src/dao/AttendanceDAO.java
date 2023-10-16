/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.Database;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.AttendanceDTO;

public class AttendanceDAO {
    
    private Database connection;
    
    public AttendanceDAO(){
        this.connection = new Database(); //Cada vez que se instancia un AttendanceDAO, va a inicializar un objeto de tipo Database
    }
    
    public boolean addStatus(AttendanceDTO attendance){
        PreparedStatement ps = null;
            try{
                ps = connection.connect().prepareStatement("INSERT INTO attendance VALUES(null,?,?,?)");
                ps.setInt(1, attendance.getStudentId());
                ps.setString(2, attendance.getDate());
                ps.setInt(3, attendance.getAttendaceStatus());
                ps.executeUpdate();
                connection.disconnect();
                return true;
            }catch(SQLException e){
                e.printStackTrace(); //Imprime datos del error
                connection.disconnect();
                return false;
            }
    }
    
    
}


