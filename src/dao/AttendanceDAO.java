/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import models.Attendance;
import database.Database;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import models.AttendanceDTO;
import java.sql.ResultSet;


public class AttendanceDAO {
    
    private Database connection;
    
    public AttendanceDAO(){
        this.connection = new Database(); //Cada vez que se instancia un AttendanceDAO, va a inicializar un objeto de tipo Database
    }
    
    public boolean updateStatus(Attendance attendance, String date){
        PreparedStatement ps = null;
        try{
            ps = connection.connect().prepareStatement("UPDATE attendance SET student_status=? WHERE id=? AND date=?");
            ps.setInt(1, attendance.getStatus());
            ps.setInt(2, attendance.getStudentId());
            ps.setString(3, date);
            ps.executeUpdate();
            connection.disconnect();
            return true;
        }catch(SQLException e){
            e.printStackTrace(); 
            connection.disconnect();
            return false;
        }
    }
    
    public ArrayList<Attendance> getAttendancesByDate(String date){
        ArrayList<Attendance> list = new ArrayList<Attendance>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = connection.connect().prepareStatement("SELECT s.id, s.firstName, s.lastName, a.id, a.date, a.student_status " +
                    "FROM student s " +
                    "INNER JOIN attendance a ON s.id = a.id " + 
                    "WHERE a.date = ?"
                   );
            ps.setString(1,date);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Attendance attendance = new Attendance(
                rs.getString("date"),
                rs.getInt("id"),
                rs.getString("firstName"),
                rs.getString("lastName"),
                rs.getInt("student_status")
                );
                list.add(attendance);
            }
        connection.disconnect();
        }catch (SQLException e){
            e.printStackTrace();
            connection.disconnect();
        }
        return list;    
    }
    public ArrayList<Attendance> initializeAttendanceList(){
        ArrayList<Attendance> list = new ArrayList<Attendance>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = connection.connect().prepareStatement("SELECT * FROM student");
            rs = ps.executeQuery();
            
            while(rs.next()){
                Attendance attendance = new Attendance(
                rs.getInt("id"),
                rs.getString("firstName"),
                rs.getString("lastName")
                );
                list.add(attendance);
            }
        connection.disconnect();
        }catch (SQLException e){
            e.printStackTrace();
            connection.disconnect();
        }
        return list;
    }
        public boolean saveAttendance(Attendance attendance){
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = connection.connect().prepareStatement("INSERT INTO attendance VALUES(null,?,?,?)");
            ps.setInt(1, attendance.getStudentId());
            ps.setString(2, attendance.getDate());
            ps.setInt(3, attendance.getStatus());
            ps.executeUpdate();
            connection.disconnect();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
            connection.disconnect();
        }
        return false;
    }
}


