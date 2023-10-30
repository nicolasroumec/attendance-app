/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author usuario
 */
public class Attendance {

    public Attendance(String pDate, int pStudentId, String pFirstName, String pLastName, int pStatus) {
        this.date = pDate;
        this.studentId = pStudentId;
        this.firstName = pFirstName;
        this.lastName = pLastName;
        this.status = pStatus;
    }
    
    private String date;
    private int studentId;
    private String firstName;
    private String lastName;
    private int status;
    
    

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    
}
