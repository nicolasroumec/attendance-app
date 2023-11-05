
package models;

import java.time.LocalDateTime;

public class AttendanceDTO {
    
    private int studentId;
    private String date;
    private int attendanceStatus;

    public AttendanceDTO( int pStudentId, String pDate, int pAttendanceStatus) {

        this.studentId = pStudentId;
        this.date = pDate;
        this.attendanceStatus = pAttendanceStatus;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(int attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }
}
