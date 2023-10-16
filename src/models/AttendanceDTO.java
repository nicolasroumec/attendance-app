
package models;

import java.time.LocalDateTime;

public class AttendanceDTO {
    
    private int attendaceId;
    private int studentId;
    private LocalDateTime date;
    private int attendaceStatus;

    public AttendanceDTO(int attendaceId, int studentId, LocalDateTime date, int attendaceStatus) {
        this.attendaceId = attendaceId;
        this.studentId = studentId;
        this.date = date;
        this.attendaceStatus = attendaceStatus;
    }

    public int getAttendaceId() {
        return attendaceId;
    }

    public void setAttendaceId(int attendaceId) {
        this.attendaceId = attendaceId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getAttendaceStatus() {
        return attendaceStatus;
    }

    public void setAttendaceStatus(int attendaceStatus) {
        this.attendaceStatus = attendaceStatus;
    }
    
    public String getStatusString(){
                
        if (this.attendaceStatus == 1){
            return "Present";
        }
        else if(this.attendaceStatus == 2){
            return "Absent";
        }
        else if (this.attendaceStatus == 3){
            return "Justified";
        }
        return "Error";
    }
}
