/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.tools;

/**
 *
 * @author usuario
 */
public class AttendanceHandler {
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
}